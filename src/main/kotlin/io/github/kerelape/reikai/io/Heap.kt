package io.github.kerelape.reikai.io

import java.math.BigInteger
import java.nio.ByteBuffer
import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity

/**
 * Heap.
 *
 * @since 0.0.0
 */
class Heap(private val buffer: ByteBuffer) : RandomAccessDestination {

    override suspend fun dataize(): ByteArray {
        return this.buffer.array()
    }

    override suspend fun put(position: io.github.kerelape.reikai.core.Entity, data: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity {
        this.buffer.position(BigInteger(position.dataize()).toInt())
        this.buffer.put(data.dataize())
        return data
    }

    override suspend fun get(position: io.github.kerelape.reikai.core.Entity, size: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity {
        val data = ByteArray(BigInteger(size.dataize()).toInt())
        this.buffer.position(BigInteger(position.dataize()).toInt())
        this.buffer.get(data)
        return io.github.kerelape.reikai.core.Data(data)
    }
}
