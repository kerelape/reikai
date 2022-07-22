package me.kerelape.reikai.io.network

import java.nio.channels.AsynchronousServerSocketChannel
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.Source
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
        return byteArrayOf((if (this.channel.isOpen) 1 else 0).toByte())
    }

    /**
     * @return Next incoming connection.
     */
    override suspend fun open(): Channel {
        return suspendCoroutine { continuation ->
            this.channel.accept(this, object : CompletionHandler<AsynchronousSocketChannel, Source> {
                override fun completed(result: AsynchronousSocketChannel, attachment: Source) {
                    continuation.resume(TcpChannel(result, attachment))
                }

                override fun failed(exc: Throwable, attachment: Source) {
                    continuation.resumeWithException(exc)
                }
            })
        }
    }
}
