package me.kerelape.reikai.core

/**
 * Basic type in Reikai. Alternative to Object.
 *
 * @since 0.0.0
 */
fun interface Entity {

    /**
     * Representation of the object in bytes.
     *
     * @return This object in binary format.
     */
    suspend fun dataize(): ByteArray
}
