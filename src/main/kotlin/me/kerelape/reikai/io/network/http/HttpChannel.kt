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
     * Read the request.
     *
     * @return The hole request.
     */
    override suspend fun dataize(): ByteArray {
        val request = Row(
            DynamicHeap(),
            Memory(
                Heap(ByteBuffer.allocate(Int.SIZE_BYTES)),
                0.asEntity,
                Int.SIZE_BYTES.asEntity
            )
        )
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
     * Put the response ([data]) and close the channel.
     *
     * @param data Response.
     */
    override suspend fun put(data: Entity): Entity {
        return try {
            this.transport.put(data)
            this.transport.put(0.asEntity)
        } finally {
            this.transport.close()
        }
    }

    /**
     * Close the underlying transport.
     */
    override suspend fun close(): Source {
        this.transport.close()
        return this.parent
    }
}