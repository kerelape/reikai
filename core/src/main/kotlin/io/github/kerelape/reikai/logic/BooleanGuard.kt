package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.StructGuard
import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.Text

/**
 * BooleanGuard.
 *
 * Ensures that [origin] is one byte long.
 *
 * @since 0.2.0
 */
class BooleanGuard(origin: Entity, continuation: Entity) : EntityWrap(
    StructGuard(
        origin,
        1.asEntity,
        Text("Boolean must be 1 byte long."),
        continuation
    )
)