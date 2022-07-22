package me.kerelape.reikai.extentions

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.text.Text

/**
 * Quantum representation of the string.
 */
val String.asEntity: Entity
    get() = Text(this)
