package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Some. [True] if any of the elements is [True].
 *
 * @since 0.1.0
 */
class Some(vararg entities: Entity): EntityWrap(Entity { entities.any { it.toBoolean() }.asEntity.dataize() })
