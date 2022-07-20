package me.kerelape.reikai.io.network

import java.math.BigInteger
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
     * @todo #2 Create a socket destination and make this method work.
     *  An async socket must be used.
     * @return Socket client object.
     */
    override suspend fun open(): Channel {
        throw NotImplementedError()
    }

    /**
     * Start listening on the endpoint.
     *
     * @todo #2 Create server object that listens for incoming connections.
     *  Must be async.
     * @return A listening server object.
     */
    override suspend fun listen(): Source {
        throw NotImplementedError()
    }
}
