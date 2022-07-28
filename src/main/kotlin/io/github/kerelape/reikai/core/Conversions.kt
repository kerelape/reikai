package io.github.kerelape.reikai.core

/**
 * Entity representation of the [ByteArray].
 */
val ByteArray.asEntity: Entity
    get() = Data(this)
