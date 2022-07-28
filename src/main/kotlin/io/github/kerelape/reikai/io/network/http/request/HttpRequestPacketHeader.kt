package io.github.kerelape.reikai.io.network.http.request

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group
import io.github.kerelape.reikai.text.Newline
import io.github.kerelape.reikai.text.Sprintf
import io.github.kerelape.reikai.text.Text

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
