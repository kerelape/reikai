package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import me.kerelape.reikai.logic.False
import me.kerelape.reikai.logic.True

/**
 * Entity representation of the [Boolean].
 */
val Boolean.asEntity: io.github.kerelape.reikai.core.Entity
    get() = when (this) {
        true -> True
        false -> False
    }
