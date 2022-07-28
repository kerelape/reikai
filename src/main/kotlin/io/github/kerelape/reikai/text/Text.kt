package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * Wrapper for kotlin strings.
 *
 * @since 0.0.0
 */
class Text(origin: String) : EntityWrap(Entity { origin.toByteArray() })
