package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity

/**
 * Destination with random access.
 *
 * @since 0.0.0
 */
interface RandomAccessDestination : Entity {

    /**
     * Put [data] and the [position].
     *
     * @param position Offset.
     * @param data Data to put.
     * @return The data that was put.
     */
    suspend fun put(position: Entity, data: Entity): Entity
}
