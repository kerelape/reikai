package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity

/**
 * Entity representation of the [ByteArray].
 */
val ByteArray.asEntity: Entity
    get() = Data(this)
