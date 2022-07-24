package io.github.kerelape.reikai.io.network.http.request

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group
import me.kerelape.reikai.text.Newline
import me.kerelape.reikai.text.Sprintf
import me.kerelape.reikai.text.Text

/**
 * HTTP request packet header.
 *
 * @since 0.0.0
 */
class HttpRequestPacketHeader(method: io.github.kerelape.reikai.core.Entity, path: io.github.kerelape.reikai.core.Entity, vararg headers: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Group(
        Sprintf(Text("%s %s HTTP/1.1"), method, path),
        *(headers.map { io.github.kerelape.reikai.core.Group(Newline, it) }.toTypedArray())
    )
)