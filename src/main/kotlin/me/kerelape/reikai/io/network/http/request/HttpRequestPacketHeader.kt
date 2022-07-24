package me.kerelape.reikai.io.network.http.request

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.core.Group
import me.kerelape.reikai.text.Newline
import me.kerelape.reikai.text.Sprintf
import me.kerelape.reikai.text.Text

/**
 * HTTP request packet header.
 *
 * @since 0.0.0
 */
class HttpRequestPacketHeader(method: Entity, path: Entity, vararg headers: Entity) : EntityWrap(
    Group(
        Sprintf(Text("%s %s HTTP/1.1"), method, path),
        *(headers.map { Group(Newline, it) }.toTypedArray())
    )
)