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
class HttpPacket(header: Entity, body: Entity = Empty) : EntityWrap(
    Group(header, Separator, body)
)
