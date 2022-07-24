package me.kerelape.reikai.io.network.http

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.io.Channel
import me.kerelape.reikai.io.Source

class HttpServer(private val transport: Source) : EntityWrap(transport), Source {

    override suspend fun open(): Channel {
        return HttpChannel(this.transport.open())
    }

    override suspend fun close(): Entity {
        return this.transport.close()
    }
}
