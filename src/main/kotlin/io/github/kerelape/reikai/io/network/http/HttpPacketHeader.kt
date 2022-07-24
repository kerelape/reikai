package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group
import io.github.kerelape.reikai.text.Newline

/**
 * General HTTP packet header.
 *
 * @param type First line of the header.
 * @param headers HTTP headers.
 * @since 0.0.0
 */
class HttpPacketHeader(type: Entity, vararg headers: Entity) : EntityWrap(
    Group(type, *(headers.map { Group(Newline, it) }.toTypedArray()))
)
