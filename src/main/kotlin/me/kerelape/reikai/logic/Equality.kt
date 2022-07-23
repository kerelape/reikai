package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Equality of entities.
 *
 * @since 0.0.0
 */
class Equality(vararg entities: Entity) : EntityWrap(Entity {
    (if (BigInteger(Xor(*entities).dataize()) == BigInteger.ZERO) True else False).dataize()
})
