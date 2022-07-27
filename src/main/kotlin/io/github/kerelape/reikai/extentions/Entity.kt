package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Entity
import java.math.BigInteger

/**
 * Convert [Entity] to [Boolean].
 *
 * @since 0.0.0
 */
suspend fun Entity.toBoolean(): Boolean {
    return try {
        BigInteger(this.dataize()) != BigInteger.ZERO
    } catch (exception: NumberFormatException) {
        false
    }
}
