package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity

/**
 * Sequence of data.
 *
 * @todo #30 Make use of Random Access Destination instead of Array List.
 *  The destination must be passed through the constructor.
 * @since 0.0.0
 */
class Row : Destination {
    private val accumulator = arrayListOf<Byte>()

    override suspend fun dataize(): ByteArray {
        return this.accumulator.toByteArray()
    }

    /**
     * Append [data].
     *
     * @return This object with [data] appended.
     */
    override suspend fun put(data: Entity): Entity {
        this.accumulator.addAll(data.dataize().toList())
        return this
    }
}
