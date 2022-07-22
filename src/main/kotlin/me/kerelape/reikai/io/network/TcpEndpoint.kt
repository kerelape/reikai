package me.kerelape.reikai.io.network

import java.net.InetSocketAddress
import java.nio.channels.AsynchronousServerSocketChannel
import java.nio.channels.AsynchronousSocketChannel
import java.nio.channels.CompletionHandler
import java.math.BigInteger
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.Source

/**
 * Socket endpoint.
 *
 * @since 0.0.0
 */
class TcpEndpoint(private val address: Entity, private val port: Entity) : Endpoint {

    /**
     * @todo #2 Create an object that converts quantum of
     *  a number to a quantum of a string.
     * @todo #2 Create an object that can format texts like sprintf in EO.
     *  This object must accept a quantum of text and an arbitrary amount
     *  of arguments to fill the placeholders.
     * @return Its destination in format "address:port"
     */
    override suspend fun dataize(): ByteArray {
        return "${String(this.address.dataize())}:${BigInteger(this.port.dataize())}".toByteArray()
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
}
