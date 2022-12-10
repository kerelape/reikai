package io.github.kerelape.reikai.guards

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.logic.Fork

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
