package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity
import java.math.BigInteger

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
        val position = BigInteger(this.position.dataize()).toInt()
        val size = BigInteger(this.size.dataize()).toInt()
        return this.origin.dataize().slice(position..(position + size)).toByteArray()
    }

    override suspend fun put(data: Entity): Entity {
        this.origin.put(this.position, data)
        return data
    }
}
