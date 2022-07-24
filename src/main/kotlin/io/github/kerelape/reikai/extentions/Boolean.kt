package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.logic.False
import io.github.kerelape.reikai.logic.True


/**
 * Entity representation of the [Boolean].
 */
val Boolean.asEntity: Entity
    get() = when (this) {
        true -> True
        false -> False
    }
