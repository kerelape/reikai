package me.kerelape.reikai.text

import me.kerelape.reikai.core.Entity

/**
 * Sprintf.
 *
 * Note that provided template and args entities treated as Text.
 *
 * @since 0.0.0
 */
class Sprintf(private val template: Entity, private vararg val args: Entity): Entity {

    override suspend fun dataize(): ByteArray {
        val template = String(this.template.dataize())
        val args = this.args.map { String(it.dataize()) }
        return Text(template.format(args)).dataize()
    }
}