package me.kerelape.reikai.logic

import java.math.BigInteger
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

/**
 * Fork. Selects value or fallback depending on condition.
 *
 * @since 0.0.0
 */
class Fork(condition: Entity, value: Entity, fallback: Entity) : EntityWrap(Entity {
    (if (BigInteger(condition.dataize()) == BigInteger.ZERO) fallback else value).dataize()
})
