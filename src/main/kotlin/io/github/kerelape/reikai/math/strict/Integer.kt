package io.github.kerelape.reikai.math.strict

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.nio.ByteBuffer

/**
 * Wrapper for strict kotlin numbers.
 *
 * @since 0.0.0
 */
class Integer(origin: Long) : EntityWrap(Entity { ByteBuffer.allocate(Long.SIZE_BYTES).putLong(origin).array() })
