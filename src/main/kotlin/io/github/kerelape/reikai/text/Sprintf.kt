package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Sprintf.
 *
 * Note that provided template and args entities treated as Text.
 *
 * @since 0.0.0
 */
class Sprintf(template: Entity, vararg args: Entity) : EntityWrap(
    Entity {
        val template = String(template.dataize())
        val args = args.map { String(it.dataize()) }
        Text(template.format(*args.toTypedArray())).dataize()
    }
)
