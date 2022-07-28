package io.github.kerelape.reikai.core

import io.github.kerelape.reikai.logic.asEntity

/**
 * Length of the entity.
 *
 * @since 0.0.0
 */
class Length(origin: Entity) : EntityWrap(Entity { origin.dataize().size.asEntity.dataize() })
