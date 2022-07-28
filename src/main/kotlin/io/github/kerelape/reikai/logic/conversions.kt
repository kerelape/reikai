package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import java.math.BigInteger

/**
 * Entity representation of the [Boolean].
 */
val Boolean.asEntity: Entity
    get() = when (this) {
        true -> True
        false -> False
    }

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
