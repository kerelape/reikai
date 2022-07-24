package me.kerelape.reikai.io.network.http.request

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.text.Text

/**
 * HTTP packet of GET request.
 *
 * @since 0.0.0
 */
class HttpGetPacketHeader(path: Entity, vararg headers: Entity) : EntityWrap(
    HttpRequestPacketHeader(Text("GET"), path, *headers)
)
