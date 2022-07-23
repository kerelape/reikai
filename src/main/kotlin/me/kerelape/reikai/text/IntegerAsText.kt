package me.kerelape.reikai.text

import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.core.EntityWrap
import java.math.BigInteger

class IntegerAsText(source: Entity) : EntityWrap(Entity { Text(BigInteger(source.dataize()).toString()).dataize() })
