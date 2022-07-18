package me.kerelape.reikai.math.strict

import java.math.BigInteger
import me.kerelape.reikai.core.Quantum

/**
 * Wrapper for strict kotlin numbers.
 *
 * @since 0.0.0
 */
class Integer(private val origin: Long) : Quantum {

    /**
     * Converts [origin] to [ByteArray]
     *
     * @return Binary representation of [origin].
     */
    override suspend fun data(): ByteArray {
        return BigInteger(this.origin.toString()).toByteArray()
    }
}
