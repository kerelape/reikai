package io.github.kerelape.reikai.io.network.http.headers

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.text.IntegerAsText
import me.kerelape.reikai.text.Text

/**
 * Content-Length.
 *
 * @param length Entity of integer type.
 *
 * @since 0.0.0
 */
class ContentLength(length: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    HttpHeader(Text("Content-Length"), IntegerAsText(length))
)
