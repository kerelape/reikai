package me.kerelape.reikai.logic

import java.math.BigInteger
import me.kerelape.reikai.core.Entity

/**
 * Xor.
 *
 * @since 0.0.0
 */
class Xor(private vararg val elements: Entity) : Entity {

    override suspend fun dataize(): ByteArray {
        if (this.elements.size < 2) {
            throw IllegalStateException("elements must contain at least 2 entities")
        }
        var previous = this.elements[0].dataize()
        for (index in 1 until this.elements.size) {
            val next = BigInteger(this.elements[index].dataize())
            previous = BigInteger(previous).xor(next).toByteArray()
        }
        return previous
    }
}
