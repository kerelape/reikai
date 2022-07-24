package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.text.Text

/**
 * Entity representation of the string.
 */
val String.asEntity: Entity
    get() = Text(this)
