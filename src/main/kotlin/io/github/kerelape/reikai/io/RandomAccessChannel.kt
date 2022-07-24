package io.github.kerelape.reikai.io

/**
 * Random access channel.
 *
 * @since 0.0.0
 */
interface RandomAccessChannel : RandomAccessDestination {

    /**
     * Close the channel.
     *
     * @return Source that opened the channel.
     */
    suspend fun close(): RandomAccessSource
}
