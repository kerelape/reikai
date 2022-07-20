package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity

/**
 * Source of data.
 *
 * @since 0.0.0
 */
interface Source : Entity {

    suspend fun open(): Channel
}
