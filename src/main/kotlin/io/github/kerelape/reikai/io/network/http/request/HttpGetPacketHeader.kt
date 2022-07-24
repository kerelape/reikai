package io.github.kerelape.reikai.io.network.http.request

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.text.Text

/**
 * HTTP packet of GET request.
 *
 * @since 0.0.0
 */
class HttpGetPacketHeader(path: io.github.kerelape.reikai.core.Entity, vararg headers: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    HttpRequestPacketHeader(Text("GET"), path, *headers)
)
