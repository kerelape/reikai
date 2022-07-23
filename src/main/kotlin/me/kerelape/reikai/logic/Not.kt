package me.kerelape.reikai.logic

import java.math.BigInteger
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

/**
 * Inverted bits of origin.
 *
 * @since 0.0.0
 */
class Not(origin: Entity) : EntityWrap(Entity {
    BigInteger(origin.dataize()).not().toByteArray()
})
