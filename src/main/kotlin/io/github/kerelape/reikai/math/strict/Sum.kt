package io.github.kerelape.reikai.math.strict

import java.math.BigInteger
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Sum of two numbers.
 *
 * @since 0.0.0
 */
class Sum(base: io.github.kerelape.reikai.core.Entity, addend: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(
    io.github.kerelape.reikai.core.Entity {
        BigInteger(base.dataize()).add(BigInteger(addend.dataize())).toByteArray()
    })
