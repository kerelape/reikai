package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import me.kerelape.reikai.text.Text

/**
 * Entity representation of the string.
 */
val String.asEntity: io.github.kerelape.reikai.core.Entity
    get() = Text(this)
