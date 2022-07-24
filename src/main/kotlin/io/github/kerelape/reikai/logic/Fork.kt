package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.extentions.toBoolean

/**
 * Fork. Selects value or fallback depending on condition.
 *
 * @since 0.0.0
 */
class Fork(condition: io.github.kerelape.reikai.core.Entity, value: io.github.kerelape.reikai.core.Entity, fallback: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Entity {
        (if (condition.toBoolean()) value else fallback).dataize()
    })
