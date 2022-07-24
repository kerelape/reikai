package me.kerelape.reikai.io.network.http

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.io.Source

/**
 * HTTP request.
 *
 * @since 0.0.0
 */
class HttpRequest(transport: Source, request: Entity) : EntityWrap(Entity {
    val channel = HttpChannel(transport.open(), transport)
    try {
        channel.put(request).dataize()
    } finally {
        channel.close()
    }
})
