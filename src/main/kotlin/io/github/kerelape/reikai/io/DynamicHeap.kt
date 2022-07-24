package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity
import me.kerelape.reikai.extentions.asEntity
import java.math.BigInteger

/**
 * Heap with dynamic size.
 *
 * @since 0.0.0
 */
class DynamicHeap(private val limit: io.github.kerelape.reikai.core.Entity = (-1).asEntity) : RandomAccessDestination {
    private val heap = arrayListOf<Byte>()

    override suspend fun dataize(): ByteArray {
        return this.heap.toByteArray()
    }

    override suspend fun put(position: io.github.kerelape.reikai.core.Entity, data: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity {
        val pos = BigInteger(position.dataize()).toInt()
        val dat = data.dataize()
        val limit = BigInteger(this.limit.dataize()).toInt()
        if (pos + dat.size > limit && limit != -1) {
            throw IllegalArgumentException("Out of limit")
        }
        this.heap.addAll(pos, dat.toList())
        return io.github.kerelape.reikai.core.Data(dat)
    }

    override suspend fun get(position: io.github.kerelape.reikai.core.Entity, size: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity {
        val start = BigInteger(position.dataize())
        val end = start.add(BigInteger(size.dataize()))
        return io.github.kerelape.reikai.core.Data(this.heap.subList(start.toInt(), end.toInt()).toByteArray())
    }
}
