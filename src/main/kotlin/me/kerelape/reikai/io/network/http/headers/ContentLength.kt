package me.kerelape.reikai.io.network.http.headers

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.text.IntegerAsText
import me.kerelape.reikai.text.Text

/**
 * Content-Length.
 *
 * @since 0.0.0
 */
class ContentLength(length: Entity) : EntityWrap(
    HttpHeader(Text("Content-Length"), IntegerAsText(length))
)
