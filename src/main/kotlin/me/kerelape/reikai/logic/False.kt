package me.kerelape.reikai.logic

import me.kerelape.reikai.core.Entity

/**
 * False object that always dataizes as 0.
 *
 * @since 0.0.0
 */
object False : Entity {

    /**
     * @return [ByteArray] that contains a single byte, which equals to 0.
     */
    override suspend fun dataize(): ByteArray {
        return byteArrayOf(0)
    }
}
