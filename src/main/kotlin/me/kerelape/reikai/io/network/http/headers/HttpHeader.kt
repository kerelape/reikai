package me.kerelape.reikai.io.network.http.headers

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.core.Group
import me.kerelape.reikai.text.Space
import me.kerelape.reikai.text.Text

/**
 * HTTP header. in format: "[name]: [value]"
 *
 * @since 0.0.0
 */
class HttpHeader(name: Entity, value: Entity) : EntityWrap(
    Group(name, Text(":"), Space, value)
)
