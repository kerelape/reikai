package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

/**
 * Equality of entities.
 *
 * @since 0.0.0
 */
class Equality(vararg entities: Entity) : EntityWrap(Not(Xor(*entities)))
