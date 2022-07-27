package io.github.kerelape.reikai.binary

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Or.
 *
 * @since 0.0.1
 */
class Or(vararg elements: Entity) : EntityWrap(Entity {
    if (elements.size < 2) {
        throw IllegalStateException("elements must contain at least 2 entities")
    }
    var previous = elements[0].dataize()
    for (index in 1 until elements.size) {
        val next = BigInteger(elements[index].dataize())
        previous = BigInteger(previous).or(next).toByteArray()
    }
    previous
})
