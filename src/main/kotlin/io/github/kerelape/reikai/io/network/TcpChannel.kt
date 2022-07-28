/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 kerelape
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.kerelape.reikai.io.network

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.Source
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.nio.ByteBuffer
import java.nio.channels.AsynchronousSocketChannel
import java.nio.channels.CompletionHandler
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * TCP destination.
 *
 * @since 0.0.0
 */
class TcpChannel(private val socket: AsynchronousSocketChannel, private val parent: Source) : Channel {

    /**
     * Read next chunk of data from the socket.
     *
     * @return The next chunk (1024 bytes).
     */
    override suspend fun dataize(): ByteArray {
        return suspendCoroutine { continuation ->
            with(ByteBuffer.allocate(1024)) {
                this@TcpChannel.socket.read(
                    this,
                    this,
                    object : CompletionHandler<Int, ByteBuffer> {
                        override fun completed(result: Int, attachment: ByteBuffer) {
                            continuation.resume(attachment.array())
                        }

                        override fun failed(exc: Throwable, attachment: ByteBuffer) {
                            continuation.resumeWithException(exc)
                        }
                    }
                )
            }
        }
    }

    /**
     * Put arbitrary data to the socket channel.
     *
     * @return [data].
     */
    override suspend fun put(data: Entity): Entity {
        val bytes = data.dataize()
        return suspendCoroutine { continuation ->
            this.socket.write(
                ByteBuffer.wrap(bytes),
                null,
                object : CompletionHandler<Int, Unit?> {
                    override fun completed(result: Int, attachment: Unit?) {
                        continuation.resume(data)
                    }

                    override fun failed(exc: Throwable, attachment: Unit?) {
                        continuation.resumeWithException(exc)
                    }
                }
            )
        }
    }

    /**
     * Close the underlying [AsynchronousSocketChannel].
     *
     * @return The source that made this channel.
     */
    override suspend fun close(): Source {
        withContext(Dispatchers.IO) {
            this@TcpChannel.socket.close()
        }
        return this.parent
    }
}
