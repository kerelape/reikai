package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.extentions.asEntity

/**
 * Equality of entities.
 *
 * @since 0.0.0
 */
class Equality(vararg entities: Entity) : EntityWrap(Entity {
    Xor(*entities).dataize().contentEquals(False.dataize()).asEntity.dataize()
})
