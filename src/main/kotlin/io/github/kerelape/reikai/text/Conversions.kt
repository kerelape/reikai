package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity

/**
 * Entity representation of the string.
 */
val String.asEntity: Entity
    get() = Text(this)
