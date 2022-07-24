package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * False object that always dataizes as 0.
 *
 * @since 0.0.0
 */
object False : EntityWrap(Entity { byteArrayOf(0) })
