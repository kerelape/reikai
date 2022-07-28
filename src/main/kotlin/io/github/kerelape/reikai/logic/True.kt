package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Truth object that always dataizes as 1.
 *
 * @since 0.0.0
 */
object True : EntityWrap(Entity { byteArrayOf(-127) })