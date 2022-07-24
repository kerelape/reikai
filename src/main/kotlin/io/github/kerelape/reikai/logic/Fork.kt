package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.extentions.toBoolean

/**
 * Fork. Selects value or fallback depending on condition.
 *
 * @since 0.0.0
 */
class Fork(condition: Entity, value: Entity, fallback: Entity) : EntityWrap(Entity {
    (if (condition.toBoolean()) value else fallback).dataize()
})
