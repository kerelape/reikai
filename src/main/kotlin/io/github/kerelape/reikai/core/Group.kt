package io.github.kerelape.reikai.core

/**
 * Concatenates items.
 *
 * @since 0.0.0
 */
class Group(vararg items: Entity) : EntityWrap(
    Entity {
        items
            .map { it.dataize() }
            .reduce { acc, bytes -> acc.plus(bytes) }
    }
)
