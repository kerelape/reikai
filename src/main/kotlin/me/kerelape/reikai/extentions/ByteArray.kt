package me.kerelape.reikai.extentions

import me.kerelape.reikai.core.Data
import me.kerelape.reikai.core.Entity

/**
 * Entity representation of the [ByteArray].
 */
val ByteArray.asEntity: Entity
    get() = Data(this)
