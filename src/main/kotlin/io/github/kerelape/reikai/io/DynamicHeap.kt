package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.math.asEntity
import java.math.BigInteger

/**
 * Heap with dynamic size.
 *
 * @since 0.0.0
 */
class DynamicHeap(private val limit: Entity = (-1).asEntity) : RandomAccessDestination {
    private val heap = arrayListOf<Byte>()

    override suspend fun dataize(): ByteArray {
        return this.heap.toByteArray()
    }

    override suspend fun put(position: Entity, data: Entity): Entity {
        val pos = BigInteger(position.dataize()).toInt()
        val dat = data.dataize()
        val limit = BigInteger(this.limit.dataize()).toInt()
        if (pos + dat.size > limit && limit != -1) {
            throw IllegalArgumentException("Out of limit")
        }
        this.heap.addAll(pos, dat.toList())
        return Data(dat)
    }

    override suspend fun get(position: Entity, size: Entity): Entity {
        val start = BigInteger(position.dataize())
        val end = start.add(BigInteger(size.dataize()))
        return Data(this.heap.subList(start.toInt(), end.toInt()).toByteArray())
    }
}
