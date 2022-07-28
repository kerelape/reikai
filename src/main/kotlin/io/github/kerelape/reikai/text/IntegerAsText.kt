package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

/**
 * 2 -> "2".
 *
 * @since 0.0.0
 */
class IntegerAsText(source: Entity) : EntityWrap(
    Entity {
        Text(
            BigInteger(source.dataize()).toString()
        ).dataize()
    }
)
