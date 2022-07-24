package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity

/**
 * Wrapper for kotlin strings.
 *
 * @since 0.0.0
 */
class Text(private val origin: String) : Entity {

    /**
     * Converts [origin] to [ByteArray]
     *
     * @return Binary representation of [origin].
     */
    override suspend fun dataize(): ByteArray {
        return this.origin.toByteArray()
    }
}