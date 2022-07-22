package me.kerelape.reikai.io.network

import java.nio.ByteBuffer
import java.nio.channels.AsynchronousSocketChannel
import java.nio.channels.CompletionHandler
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.Source

/**
 * TCP destination.
 *
 * @since 0.0.0
 */
class TcpChannel(private val socket: AsynchronousSocketChannel, private val parent: Source) : Channel {

    /**
     * Read next byte from the socket.
     *
     * @return The next byte in the socket channel.
     */
    override suspend fun dataize(): ByteArray {
        return suspendCoroutine { continuation ->
            with(ByteBuffer.allocate(1)) {
                this@TcpChannel.socket.read(this, this, object : CompletionHandler<Int, ByteBuffer> {
                    override fun completed(result: Int, attachment: ByteBuffer) {
                        continuation.resume(attachment.array())
                    }

                    override fun failed(exc: Throwable, attachment: ByteBuffer) {
                        continuation.resumeWithException(exc)
                    }
                })
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
            this.socket.write(ByteBuffer.wrap(bytes), null, object : CompletionHandler<Int, Unit?> {
                override fun completed(result: Int, attachment: Unit?) {
                    continuation.resume(data)
                }

                override fun failed(exc: Throwable, attachment: Unit?) {
                    continuation.resumeWithException(exc)
                }
            })
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
