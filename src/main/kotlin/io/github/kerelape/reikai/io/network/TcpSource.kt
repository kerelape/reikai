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

import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.Source
import io.github.kerelape.reikai.logic.True
import io.github.kerelape.reikai.logic.asEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.nio.channels.AsynchronousServerSocketChannel
import java.nio.channels.AsynchronousSocketChannel
import java.nio.channels.CompletionHandler
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * Source of TCP connections.
 *
 * @since 0.0.0
 */
class TcpSource(private val channel: AsynchronousServerSocketChannel) : Source {
    /**
     * @return 1 or 0 depending on its state (1 for open, and 0 for closed)
     */
    override suspend fun dataize(): ByteArray {
        return this.channel.isOpen.asEntity.dataize()
    }

    /**
     * @return Next incoming connection.
     */
    override suspend fun open(): Channel {
        return suspendCoroutine { continuation ->
            this.channel.accept(
                this,
                object : CompletionHandler<AsynchronousSocketChannel, Source> {
                    override fun completed(result: AsynchronousSocketChannel, attachment: Source) {
                        continuation.resume(TcpChannel(result, attachment))
                    }

                    override fun failed(exc: Throwable, attachment: Source) {
                        continuation.resumeWithException(exc)
                    }
                }
            )
        }
    }

    /**
     * Close the underlying [AsynchronousServerSocketChannel].
     *
     * @return [True]
     */
    override suspend fun close(): io.github.kerelape.reikai.core.Entity {
        withContext(Dispatchers.IO) {
            this@TcpSource.channel.close()
        }
        return True
    }
}
