package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Every. [True] if all elements is [True].
 *
 * @since 0.1.0
 */
class Every(vararg entities: Entity) : EntityWrap(Entity { entities.all { it.toBoolean() }.asEntity.dataize() })
