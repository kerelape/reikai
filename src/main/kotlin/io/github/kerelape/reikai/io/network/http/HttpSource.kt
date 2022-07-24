package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.Source

/**
 * Source of HTTP channels.
 *
 * @since 0.0.0
 */
class HttpSource(private val transport: Source) : io.github.kerelape.reikai.core.EntityWrap(transport), Source {

    /**
     * Open a new HttpChannel.
     */
    override suspend fun open(): Channel {
        return HttpChannel(this.transport.open(), this)
    }

    /**
     * Close the underlying transport.
     */
    override suspend fun close(): io.github.kerelape.reikai.core.Entity {
        return this.transport.close()
    }
}
