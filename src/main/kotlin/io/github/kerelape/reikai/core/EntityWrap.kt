package io.github.kerelape.reikai.core

/**
 * Wrap envelope for [Entity].
 *
 * @since 0.0.0
 */
abstract class EntityWrap(wrap: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.Entity by wrap
