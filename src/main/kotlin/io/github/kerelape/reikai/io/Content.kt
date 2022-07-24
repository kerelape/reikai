package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

class Content(origin: RandomAccessSource) : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity {
    val channel = origin.open()
    val content = channel.dataize()
    channel.close()
    content
})
