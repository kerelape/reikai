package io.github.kerelape.reikai.binary

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Xor.
 *
 * @since 0.0.0
 */
class Xor(vararg elements: Entity) : EntityWrap(Entity {
    if (elements.size < 2) {
        throw IllegalStateException("elements must contain at least 2 entities")
    }
    elements
        .map { BigInteger(it.dataize()) }
        .reduce { a, b -> a.xor(b) }
        .toByteArray()
})
