package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Empty
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group

/**
 * HTTP packet.
 *
 * @since 0.0.0
 */
class HttpPacket(header: io.github.kerelape.reikai.core.Entity, body: io.github.kerelape.reikai.core.Entity = io.github.kerelape.reikai.core.Empty) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Group(header, Separator, body)
)
