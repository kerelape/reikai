package io.github.kerelape.reikai.io.network.http.headers

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.text.IntegerAsText
import io.github.kerelape.reikai.text.Text

/**
 * Content-Length.
 *
 * @param length Entity of integer type.
 *
 * @since 0.0.0
 */
class ContentLength(length: Entity) : EntityWrap(
    HttpHeader(Text("Content-Length"), IntegerAsText(length))
)
