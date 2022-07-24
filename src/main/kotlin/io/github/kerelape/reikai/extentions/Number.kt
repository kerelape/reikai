package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.math.strict.Integer

/**
 * Entity representation of the number.
 */
val Number.asEntity: Entity
    get() = Integer(this.toLong())
