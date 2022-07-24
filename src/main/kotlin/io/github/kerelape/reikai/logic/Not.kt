package io.github.kerelape.reikai.logic

import java.math.BigInteger
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Inverted bits of origin.
 *
 * @since 0.0.0
 */
class Not(origin: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity {
    BigInteger(origin.dataize()).not().toByteArray()
})
