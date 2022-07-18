package me.kerelape.reikai.core

/**
 * Basic type in Reikai. Alternative to Object.
 *
 * @since 0.0.0
 */
interface Quantum {

    /**
     * Representation of the object in bytes.
     *
     * @return This object in binary format.
     */
    suspend fun data(): ByteArray
}
