package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

/**
 * False object that always dataizes as 0.
 *
 * @since 0.0.0
 */
object False : EntityWrap(Entity { byteArrayOf(0) })
