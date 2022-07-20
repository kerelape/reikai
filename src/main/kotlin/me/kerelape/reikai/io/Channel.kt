package me.kerelape.reikai.io

import me.kerelape.reikai.core.Destination

/**
 * Destination that can be closed.
 *
 * @since 0.0.0
 */
interface Channel : Destination {

    /**
     * Close the channel.
     *
     * @return [Source] that opened the channel.
     */
    suspend fun close(): Source
}
