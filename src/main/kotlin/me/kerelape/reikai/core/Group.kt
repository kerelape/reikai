package me.kerelape.reikai.core

/**
 * Concatenates items.
 *
 * @since 0.0.0
 */
class Group(vararg items: Entity) : EntityWrap(Entity {
    items
        .map { it.dataize().toList() }
        .reduce { acc, bytes -> acc.plus(bytes) }
        .toByteArray()
})