package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.extentions.asEntity
import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.Row
import io.github.kerelape.reikai.io.Source

/**
 * HTTP channel.
 *
 * @since 0.0.0
 */
class HttpChannel(private val transport: Channel, private val parent: Source) : Channel {

    /**
     * @return Content from the endpoint.
     */
    override suspend fun dataize(): ByteArray {
        val request = Row()
        while (true) {
            val chunk = this.transport.dataize()
            if (chunk.last() == 0.toByte()) {
                break
            }
            request.put(Data(chunk))
        }
        return request.dataize()
    }

    /**
     * Put the [data] to the endpoint.
     *
     * @return Response.
     */
    override suspend fun put(data: Entity): Entity {
        this.transport.put(data)
        this.transport.put(0.asEntity)
        return this
    }

    /**
     * Close the underlying transport.
     */
    override suspend fun close(): Source {
        this.transport.close()
        return this.parent
    }
}