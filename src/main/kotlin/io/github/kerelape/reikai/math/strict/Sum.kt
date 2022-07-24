package io.github.kerelape.reikai.math.strict

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Sum of two numbers.
 *
 * @since 0.0.0
 */
class Sum(base: Entity, addend: Entity) : EntityWrap(Entity {
    BigInteger(base.dataize()).add(BigInteger(addend.dataize())).toByteArray()
})
