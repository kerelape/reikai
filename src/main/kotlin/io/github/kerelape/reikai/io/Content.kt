package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

/**
 * All content of a [RandomAccessSource].
 *
 * @since 0.0.0
 */
class Content(origin: RandomAccessSource) : EntityWrap(
    Entity {
        val channel = origin.open()
        val content = channel.dataize()
        channel.close()
        content
    }
)
