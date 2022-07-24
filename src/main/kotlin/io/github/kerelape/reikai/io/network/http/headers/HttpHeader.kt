package io.github.kerelape.reikai.io.network.http.headers

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group
import io.github.kerelape.reikai.text.Space
import io.github.kerelape.reikai.text.Text

/**
 * HTTP header. in format: "[name]: [value]"
 *
 * @since 0.0.0
 */
class HttpHeader(name: Entity, value: Entity) : EntityWrap(
    Group(name, Text(":"), Space, value)
)
