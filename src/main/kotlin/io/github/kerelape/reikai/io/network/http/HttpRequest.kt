package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.io.Source

/**
 * HTTP request.
 *
 * @since 0.0.0
 */
class HttpRequest(transport: Source, request: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Entity {
        val channel = HttpChannel(transport.open(), transport)
        try {
            channel.put(request).dataize()
        } finally {
            channel.close()
        }
    })
