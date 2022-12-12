package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.Entity
import io.github.kerelape.reikai.EntityWrap
import io.github.kerelape.reikai.Error
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
