package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity

/**
 * Destination of data.
 *
 * @since 0.0.0
 */
interface Destination : io.github.kerelape.reikai.core.Entity {

    /**
     * Put arbitrary [data] to the destination.
     *
     * @param data Arbitrary data.
     * @return The data that was put.
     */
    suspend fun put(data: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity
}
