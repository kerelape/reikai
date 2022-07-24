package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.extentions.asEntity
import io.github.kerelape.reikai.logic.Equality
import io.github.kerelape.reikai.logic.Fork

/**
 * Mutable memory.
 *
 * @since 0.0.0
 */
class Memory(
    private val origin: RandomAccessDestination,
    private val position: Entity = 0.asEntity,
    private val size: Entity = (-1).asEntity
) : Destination {

    override suspend fun dataize(): ByteArray {
        return Fork(
            Equality(this.size, (-1).asEntity),
            this.origin,
            Entity { this.origin.get(this.position, this.size).dataize() }
        ).dataize()
    }

    override suspend fun put(data: Entity): Entity {
        this.origin.put(this.position, data)
        return data
    }
}
