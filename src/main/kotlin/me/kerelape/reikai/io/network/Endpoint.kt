package me.kerelape.reikai.io.network

import me.kerelape.reikai.io.Source

/**
 * Endpoint.
 *
 * @since 0.0.0
 */
interface Endpoint : Source {

    /**
     * Listen for incoming connections.
     *
     * @return [Source] of incoming connections.
     */
    suspend fun listen(): Source
}
