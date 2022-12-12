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
package io.github.kerelape.reikai.io.filesystem

import io.github.kerelape.reikai.Data
import io.github.kerelape.reikai.Entity
import io.github.kerelape.reikai.io.RandomAccessChannel
import io.github.kerelape.reikai.io.RandomAccessSource
import io.github.kerelape.reikai.math.asEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.math.BigInteger
import java.nio.ByteBuffer
import java.nio.channels.AsynchronousFileChannel
import java.nio.channels.CompletionHandler
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * Random Access File channel.
 *
 * @since 0.0.0
 */
class RandomAccessFileChannel(
    private val channel: AsynchronousFileChannel,
    private val parent: RandomAccessSource
) : RandomAccessChannel {
    /**
     * @return All content of the file.
     */
    override suspend fun dataize(): ByteArray {
        val length = withContext(Dispatchers.IO) {
            this@RandomAccessFileChannel.channel.size()
        }
        return this.get(0.asEntity, length.asEntity).dataize()
    }

    override suspend fun put(position: Entity, data: Entity): Entity {
        val content = ByteBuffer.wrap(data.dataize())
        val offset = BigInteger(position.dataize()).toLong()
        return suspendCoroutine { continuation ->
            this.channel.write(
                content,
                offset,
                content,
                object : CompletionHandler<Int, ByteBuffer> {
                    override fun completed(result: Int?, attachment: ByteBuffer) {
                        continuation.resume(Data(attachment))
                    }

                    override fun failed(exc: Throwable, attachment: ByteBuffer) {
                        continuation.resumeWithException(exc)
                    }
                }
            )
        }
    }

    override suspend fun get(position: Entity, size: Entity): Entity {
        val offset = BigInteger(position.dataize()).toLong()
        val length = BigInteger(size.dataize()).toInt()
        return suspendCoroutine { continuation ->
            val content = ByteBuffer.allocateDirect(length)
            this.channel.read(
                content,
                offset,
                content,
                object : CompletionHandler<Int, ByteBuffer> {
                    override fun completed(result: Int?, attachment: ByteBuffer) {
                        continuation.resume(Data(attachment))
                    }

                    override fun failed(exc: Throwable, attachment: ByteBuffer) {
                        continuation.resumeWithException(exc)
                    }
                }
            )
        }
    }

    /**
     * Close the channel.
     *
     * @return Parent source.
     */
    override suspend fun close(): RandomAccessSource {
        withContext(Dispatchers.IO) {
            this@RandomAccessFileChannel.channel.close()
        }
        return this.parent
    }
}
