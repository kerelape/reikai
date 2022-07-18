package me.kerelape.reikai.extentions

import me.kerelape.reikai.core.Quantum
import me.kerelape.reikai.math.strict.Integer

/**
 * Quantum representation of the number.
 */
val Number.asQuantum: Quantum
    get() = Integer(this.toLong())
