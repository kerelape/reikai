package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.Entity
import io.github.kerelape.reikai.EntityWrap
import io.github.kerelape.reikai.Error
import io.github.kerelape.reikai.text.Text

/**
 * Every. [True] if all elements is [True].
 *
 * @since 0.1.0
 */
class Every(vararg entities: Entity) : EntityWrap(
    Fork(
        entities.isEmpty().asEntity,
        Error(Text("Elements cannot be empty")),
        Entity {
            entities.all { it.toBoolean() }.asEntity.dataize()
        }
    )
)
