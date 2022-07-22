package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity

/**
 * Mutable memory.
 *
 * @since 0.0.0
 */
class Memory(
    private val origin: RandomAccessDestination,
    private val position: Entity,
    private val size: Entity,
) : Destination {

    override suspend fun dataize(): ByteArray {
        return this.origin.get(this.position, this.size).dataize()
    }

    override suspend fun put(data: Entity): Entity {
        this.origin.put(this.position, data)
        return data
    }
}
