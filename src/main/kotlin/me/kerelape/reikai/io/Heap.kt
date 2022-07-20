package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity
import java.math.BigInteger
import java.nio.ByteBuffer

/**
 * Heap.
 *
 * @since 0.0.0
 */
class Heap(private val buffer: ByteBuffer) : RandomAccessDestination {

    override suspend fun dataize(): ByteArray {
        return this.buffer.array()
    }

    override suspend fun put(position: Entity, data: Entity): Entity {
        this.buffer.put(BigInteger(position.dataize()).toInt(), data.dataize())
        return data
    }
}
