package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Truth object that always dataizes as 1.
 *
 * @since 0.0.0
 */
object True : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity { byteArrayOf(-127) })
