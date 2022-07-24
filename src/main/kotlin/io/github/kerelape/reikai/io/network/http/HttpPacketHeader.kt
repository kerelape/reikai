package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group
import me.kerelape.reikai.text.Newline

/**
 * General HTTP packet header.
 *
 * @param type First line of the header.
 * @param headers HTTP headers.
 * @since 0.0.0
 */
class HttpPacketHeader(type: io.github.kerelape.reikai.core.Entity, vararg headers: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Group(
        type,
        *(headers.map { io.github.kerelape.reikai.core.Group(Newline, it) }.toTypedArray())
    )
)
