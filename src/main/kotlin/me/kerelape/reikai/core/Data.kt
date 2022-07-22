package me.kerelape.reikai.core

/**
 * Simple data entity.
 *
 * @since 0.0.0
 */
class Data(bytes: ByteArray) : EntityWrap(Entity { bytes })
