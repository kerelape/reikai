package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity

/**
 * Sprintf.
 *
 * Note that provided template and args entities treated as Text.
 *
 * @since 0.0.0
 */
class Sprintf(private val template: io.github.kerelape.reikai.core.Entity, private vararg val args: io.github.kerelape.reikai.core.Entity):
    io.github.kerelape.reikai.core.Entity {

    override suspend fun dataize(): ByteArray {
        val template = String(this.template.dataize())
        val args = this.args.map { String(it.dataize()) }
        return Text(template.format(*args.toTypedArray())).dataize()
    }
}
