package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import io.github.kerelape.reikai.core.Error
import io.github.kerelape.reikai.text.Text

/**
 * Some. [True] if any of the elements is [True].
 *
 * @since 0.1.0
 */
class Some(vararg entities: Entity) : EntityWrap(
    Fork(
        entities.isEmpty().asEntity,
        Error(Text("Elements cannot be empty")),
        Entity {
            entities.any { it.toBoolean() }.asEntity.dataize()
        }
    )
)
