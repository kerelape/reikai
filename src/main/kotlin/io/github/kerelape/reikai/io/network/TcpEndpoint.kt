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
import io.github.kerelape.reikai.logic.False
import io.github.kerelape.reikai.text.IntegerAsText
import io.github.kerelape.reikai.text.Sprintf
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.math.BigInteger
import java.net.InetSocketAddress
import java.nio.channels.AsynchronousServerSocketChannel
import java.nio.channels.AsynchronousSocketChannel
import java.nio.channels.CompletionHandler
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * Socket endpoint.
 *
 * @since 0.0.0
 */
class TcpEndpoint(private val address: Entity, private val port: Entity) : Endpoint {

    /**
     * @return Its destination in format "address:port"
     */
    override suspend fun dataize(): ByteArray {
        return Sprintf(Text("%s:%s"), this.address, IntegerAsText(this.port)).dataize()
    }

    /**
     * Connect to the endpoint.
     *
     * @return Socket client object.
     */
    override suspend fun open(): Channel {
        val address = InetSocketAddress(
            String(this.address.dataize()),
            BigInteger(this.port.dataize()).toInt()
        )
        val channel = withContext(Dispatchers.IO) {
            AsynchronousSocketChannel.open()
        }
        return suspendCoroutine { continuation ->
            channel.connect(
                address,
                this,
                object : CompletionHandler<Void, Source> {
                    override fun completed(result: Void?, attachment: Source) {
                        continuation.resume(TcpChannel(channel, attachment))
                    }

                    override fun failed(exc: Throwable, attachment: Source) {
                        continuation.resumeWithException(exc)
                    }
                }
            )
        }
    }

    /**
     * Start listening on the endpoint.
     *
     * @return A listening server object.
     */
    override suspend fun listen(): Source {
        val address = InetSocketAddress(
            String(this.address.dataize()),
            BigInteger(this.port.dataize()).toInt()
        )
        val channel = withContext(Dispatchers.IO) {
            AsynchronousServerSocketChannel.open().bind(address)
        }
        return TcpSource(channel)
    }

    /**
     * Does nothing.
     *
     * @return [False].
     */
    override suspend fun close(): Entity {
        return False
    }
}
