package io.github.kerelape.reikai.binary

import io.github.kerelape.reikai.core.Entity
import java.math.BigInteger

/**
 * And.
 *
 * @since 0.0.1
 */
class And(private vararg val elements: Entity) : Entity {

    override suspend fun dataize(): ByteArray {
        if (this.elements.size < 2) {
            throw IllegalStateException("elements must contain at least 2 entities")
        }
        var previous = this.elements[0].dataize()
        for (index in 1 until this.elements.size) {
            val next = BigInteger(this.elements[index].dataize())
            previous = BigInteger(previous).and(next).toByteArray()
        }
        return previous
    }
}