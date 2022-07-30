package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.core.EntityWrap

class Every(vararg entities: Entity): EntityWrap(Entity { entities.all { it.toBoolean() }.asEntity.dataize() })