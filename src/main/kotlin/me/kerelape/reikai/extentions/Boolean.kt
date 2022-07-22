package me.kerelape.reikai.extentions

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.logic.False
import me.kerelape.reikai.logic.True

/**
 * Entity representation of the [Boolean].
 */
val Boolean.asEntity: Entity
    get() = when (this) {
        true -> True
        false -> False
    }
