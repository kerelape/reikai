package io.github.kerelape.reikai.binary

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * Inverted bits of origin.
 *
 * @since 0.0.0
 */
class Not(origin: Entity) : EntityWrap(Entity {
    BigInteger(origin.dataize()).not().toByteArray()
})
