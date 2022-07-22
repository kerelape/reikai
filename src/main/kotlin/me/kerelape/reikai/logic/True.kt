package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity

/**
 * Truth object that always dataizes as 1.
 *
 * @since 0.0.0
 */
object True : Entity {

    /**
     * @return [ByteArray] that contains a single byte, which equals to 1.
     */
    override suspend fun dataize(): ByteArray {
        return byteArrayOf(1)
    }
}
