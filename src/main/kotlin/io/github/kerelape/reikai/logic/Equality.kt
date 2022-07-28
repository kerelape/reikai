package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.binary.Xor
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Equality of entities.
 *
 * @since 0.0.0
 */
class Equality(first: Entity, second: Entity) : EntityWrap(Entity {
    (if (BigInteger(Xor(first, second).dataize()) == BigInteger.ZERO) True else False).dataize()
})
