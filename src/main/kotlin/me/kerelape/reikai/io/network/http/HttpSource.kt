package me.kerelape.reikai.io.network.http

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.Source

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
