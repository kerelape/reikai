package me.kerelape.reikai.io

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap

class Content(origin: RandomAccessSource) : EntityWrap(Entity {
    val channel = origin.open()
    val content = channel.dataize()
    channel.close()
    content
})
