package io.github.kerelape.reikai.core

import java.nio.ByteBuffer

/**
 * Simple data entity.
 *
 * @since 0.0.0
 */
class Data(bytes: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(bytes) {

    constructor(bytes: ByteArray) : this(io.github.kerelape.reikai.core.Entity { bytes })

    constructor(buffer: ByteBuffer) : this(io.github.kerelape.reikai.core.Entity {
        ByteArray(buffer.limit()) { buffer.get(it) }
    })
}
