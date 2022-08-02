---
title: Optional
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.logic](../index.html)/[Optional](index.html)



# Optional



[JVM]\
class [Optional](index.html)(value: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), condition: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../../io.github.kerelape.reikai.core/-entity-wrap/index.html)

Optional entity. Dataizes to the value or [Empty](../../io.github.kerelape.reikai.core/-empty/index.html) depending on the condition. Be aware that the first argument is the value, and the second one is the condition.



#### Since



0.2.0



## Parameters


JVM

| | |
|---|---|
| value | Value to dataize when the condition passes. |
| condition | Entity in logical format. |



## Constructors


| | |
|---|---|
| [Optional](-optional.html) | [JVM]<br>fun [Optional](-optional.html)(value: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), condition: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>open suspend override fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |

