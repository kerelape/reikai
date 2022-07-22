package me.kerelape.reikai.core

import java.nio.ByteBuffer

/**
 * Simple data entity.
 *
 * @since 0.0.0
 */
class Data(bytes: Entity) : EntityWrap(bytes) {

    constructor(bytes: ByteArray) : this(Entity { bytes })

    constructor(buffer: ByteBuffer) : this(Entity {
        ByteArray(buffer.limit()) { buffer.get(it) }
    })
}
