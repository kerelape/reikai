package me.kerelape.reikai.io.network.http

import me.kerelape.reikai.core.Empty
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.core.Group

/**
 * HTTP packet.
 *
 * @since 0.0.0
 */
class HttpPacket(header: Entity, body: Entity = Empty) : EntityWrap(Group(header, Separator, body))
