package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity

/**
 * Source of data.
 *
 * @since 0.0.0
 */
interface Source : Entity {

    /**
     * Open a channel on this source.
     */
    suspend fun open(): Channel

    /**
     * Close the source.
     *
     * @return Application.
     */
    suspend fun close(): Entity
}