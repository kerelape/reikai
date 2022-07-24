package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Equality of entities.
 *
 * @since 0.0.0
 */
class Equality(vararg entities: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity {
    (if (BigInteger(Xor(*entities).dataize()) == BigInteger.ZERO) True else False).dataize()
})
