package me.kerelape.reikai.io

import me.kerelape.reikai.core.Quantum

/**
 * Source of data.
 *
 * @since 0.0.0
 */
interface Source : Quantum {

    suspend fun open(): Channel
}
