package io.github.kerelape.reikai.guards

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.Text

/**
 * IntegerGuard.
 *
 * Ensures that [origin] is 8 bytes long.
 *
 * @since 0.2.0
 */
class IntegerGuard(origin: Entity, continuation: Entity) : EntityWrap(
    StructGuard(
        origin,
        8.asEntity,
        Text("Integer must be 8 bytes long."),
        continuation
    )
)
