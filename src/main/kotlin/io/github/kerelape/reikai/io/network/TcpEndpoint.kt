package io.github.kerelape.reikai.io.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.Source
import io.github.kerelape.reikai.logic.False
import io.github.kerelape.reikai.text.IntegerAsText
import io.github.kerelape.reikai.text.Sprintf
import io.github.kerelape.reikai.text.Text
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
            channel.connect(address, this, object : CompletionHandler<Void, Source> {
                override fun completed(result: Void?, attachment: Source) {
                    continuation.resume(TcpChannel(channel, attachment))
                }

                override fun failed(exc: Throwable, attachment: Source) {
                    continuation.resumeWithException(exc)
                }
            })
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
