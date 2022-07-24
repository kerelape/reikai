package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import me.kerelape.reikai.math.strict.Integer

/**
 * Entity representation of the number.
 */
val Number.asEntity: io.github.kerelape.reikai.core.Entity
    get() = Integer(this.toLong())
