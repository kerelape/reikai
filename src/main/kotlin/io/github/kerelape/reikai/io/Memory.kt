package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity
import me.kerelape.reikai.extentions.asEntity
import me.kerelape.reikai.logic.Equality
import me.kerelape.reikai.logic.Fork

/**
 * Mutable memory.
 *
 * @since 0.0.0
 */
class Memory(
    private val origin: RandomAccessDestination,
    private val position: io.github.kerelape.reikai.core.Entity = 0.asEntity,
    private val size: io.github.kerelape.reikai.core.Entity = (-1).asEntity
) : Destination {

    override suspend fun dataize(): ByteArray {
        return Fork(
            Equality(this.size, (-1).asEntity),
            this.origin,
            io.github.kerelape.reikai.core.Entity { this.origin.get(this.position, this.size).dataize() }
        ).dataize()
    }

    override suspend fun put(data: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity {
        this.origin.put(this.position, data)
        return data
    }
}
