package me.kerelape.reikai.math.strict

import me.kerelape.reikai.core.Entity
import java.nio.ByteBuffer

/**
 * Wrapper for strict kotlin numbers.
 *
 * @since 0.0.0
 */
class Integer(private val origin: Long) : Entity {

    /**
     * Converts [origin] to [ByteArray]
     *
     * @return Binary representation of [origin].
     */
    override suspend fun dataize(): ByteArray {
        return ByteBuffer.allocate(Long.SIZE_BYTES).putLong(this.origin).array()
    }
}
