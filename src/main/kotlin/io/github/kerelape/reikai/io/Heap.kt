package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity
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
        this.buffer.position(BigInteger(position.dataize()).toInt())
        this.buffer.put(data.dataize())
        return data
    }

    override suspend fun get(position: Entity, size: Entity): Entity {
        val data = ByteArray(BigInteger(size.dataize()).toInt())
        this.buffer.position(BigInteger(position.dataize()).toInt())
        this.buffer.get(data)
        return Data(data)
    }
}
