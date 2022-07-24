package me.kerelape.reikai.io.network.http

import me.kerelape.reikai.core.Data
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.extentions.asEntity
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.DynamicHeap
import me.kerelape.reikai.io.Heap
import me.kerelape.reikai.io.Memory
import me.kerelape.reikai.io.Row
import me.kerelape.reikai.io.Source
import java.nio.ByteBuffer

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
        val request = Row(DynamicHeap(), Memory(Heap(ByteBuffer.wrap(0.asEntity.dataize()))))
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