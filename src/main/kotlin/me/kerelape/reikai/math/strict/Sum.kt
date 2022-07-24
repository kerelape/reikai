package me.kerelape.reikai.math.strict

import java.math.BigInteger
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

/**
 * Sum of two numbers.
 *
 * @since 0.0.0
 */
class Sum(base: Entity, addend: Entity) : EntityWrap(Entity {
    BigInteger(base.dataize()).add(BigInteger(addend.dataize())).toByteArray()
})
