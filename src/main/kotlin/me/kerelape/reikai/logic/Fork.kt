package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.extentions.toBoolean

/**
 * Fork. Selects value or fallback depending on condition.
 *
 * @since 0.0.0
 */
class Fork(condition: Entity, value: Entity, fallback: Entity) : EntityWrap(Entity {
    (if (condition.toBoolean()) value else fallback).dataize()
})
