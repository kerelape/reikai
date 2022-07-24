package io.github.kerelape.reikai.core

import me.kerelape.reikai.extentions.asEntity

/**
 * Length of the entity.
 *
 * @since 0.0.0
 */
class Length(origin: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity { origin.dataize().size.asEntity.dataize() })
