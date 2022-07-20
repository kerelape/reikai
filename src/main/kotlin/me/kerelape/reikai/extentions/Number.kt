package me.kerelape.reikai.extentions

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.math.strict.Integer

/**
 * Quantum representation of the number.
 */
val Number.asEntity: Entity
    get() = Integer(this.toLong())
