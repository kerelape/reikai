package me.kerelape.reikai.core

/**
 * Destination of data.
 *
 * @since 0.0.0
 */
interface Destination : Entity {

    /**
     * Put arbitrary [data] to the destination.
     *
     * @param data Arbitrary data.
     * @return The data that was put.
     */
    suspend fun put(data: Entity): Entity
}
