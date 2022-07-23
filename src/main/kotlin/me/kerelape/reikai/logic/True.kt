package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

/**
 * Truth object that always dataizes as 1.
 *
 * @since 0.0.0
 */
object True : EntityWrap(Entity { byteArrayOf(-127) })
