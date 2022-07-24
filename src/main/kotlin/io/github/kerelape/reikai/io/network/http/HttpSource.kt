package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.Source

/**
 * Source of HTTP channels.
 *
 * @since 0.0.0
 */
class HttpSource(private val transport: Source) : EntityWrap(transport), Source {

    /**
     * Open a new HttpChannel.
     */
    override suspend fun open(): Channel {
        return HttpChannel(this.transport.open(), this)
    }

    /**
     * Close the underlying transport.
     */
    override suspend fun close(): Entity {
        return this.transport.close()
    }
}
