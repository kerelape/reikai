package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity

/**
 * Source of [RandomAccessChannel]s
 *
 * @since 0.0.0
 */
interface RandomAccessSource : Entity {

    /**
     * Open channel.
     *
     * @return [RandomAccessChannel].
     */
    suspend fun open(): RandomAccessChannel

    /**
     * Close the source.
     *
     * @return Application.
     */
    suspend fun close(): Entity
}
