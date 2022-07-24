package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

class IntegerAsText(source: io.github.kerelape.reikai.core.Entity) : io.github.kerelape.reikai.core.EntityWrap(io.github.kerelape.reikai.core.Entity {
    Text(
        BigInteger(source.dataize()).toString()
    ).dataize()
})
