package io.github.kerelape.reikai.io.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import io.github.kerelape.reikai.extentions.asEntity
import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.Source
import io.github.kerelape.reikai.logic.True
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