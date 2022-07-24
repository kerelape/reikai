package io.github.kerelape.reikai.core

/**
 * Concatenates items.
 *
 * @since 0.0.0
 */
class Group(vararg items: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity {
    items
        .map { it.dataize() }
        .reduce { acc, bytes -> acc.plus(bytes) }
})
