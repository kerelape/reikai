package me.kerelape.reikai.io.network.http

import me.kerelape.reikai.core.EntityWrap
import me.kerelape.reikai.core.Group
import me.kerelape.reikai.text.Newline
import me.kerelape.reikai.text.Text

/**
 * HTTP separator.
 *
 * @since 0.0.0
 */
object Separator : EntityWrap(Group(Newline, Newline))
