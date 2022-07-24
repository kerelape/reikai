package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity

/**
 * Destination with random access.
 *
 * @since 0.0.0
 */
interface RandomAccessDestination : io.github.kerelape.reikai.core.Entity {

    /**
     * Put [data] and the [position].
     *
     * @param position Offset.
     * @param data Data to put.
     * @return The data that was put.
     */
    suspend fun put(position: io.github.kerelape.reikai.core.Entity, data: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity

    /**
     * Retrieve chunk of data.
     *
     * @param position Start position of the chunk.
     * @param size Length of the chunk.
     * @return Chunk of data.
     */
    suspend fun get(position: io.github.kerelape.reikai.core.Entity, size: io.github.kerelape.reikai.core.Entity): io.github.kerelape.reikai.core.Entity
}
