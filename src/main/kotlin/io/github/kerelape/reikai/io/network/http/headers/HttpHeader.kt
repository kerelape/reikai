package io.github.kerelape.reikai.io.network.http.headers

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Group
import me.kerelape.reikai.text.Space
import me.kerelape.reikai.text.Text

/**
 * HTTP header. in format: "[name]: [value]"
 *
 * @since 0.0.0
 */
class HttpHeader(name: io.github.kerelape.reikai.core.Entity, value: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Group(name, Text(":"), Space, value)
)
