package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.core.Length
import me.kerelape.reikai.math.strict.Sum

/**
 * Sequence of data.
 *
 * @since 0.0.0
 */
class Row(
    private val origin: RandomAccessDestination,
    private val pointer: Destination
) : EntityWrap(origin), Destination {

    /**
     * Append [data] to the [origin] detination.
     *
     * @return Next position.
     */
    override suspend fun put(data: Entity): Entity {
        this.origin.put(this.pointer, data)
        this.pointer.put(Sum(this.pointer, Length(data)))
        return pointer
    }
}
