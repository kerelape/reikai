package io.github.kerelape.reikai.core

import io.github.kerelape.reikai.logic.Fork

/**
* StructGuard.
*
* Enchures that [origin] is correct length.
*
* @since 0.2.0
 */
class StructGuard(
    origin: Entity,
    length: Entity,
    message: Entity,
    continuation: Entity
) : EntityWrap(
    Fork(
        Identity(Length(origin), length),
        continuation,
        Error(message)
    )
)
