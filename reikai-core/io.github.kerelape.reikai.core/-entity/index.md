---
title: Entity
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.core](../index.html)/[Entity](index.html)



# Entity



[JVM]\
fun interface [Entity](index.html)

Basic type in Reikai. Alternative to Object.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [dataize](dataize.html) | [JVM]<br>abstract suspend fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |


## Inheritors


| Name |
|---|
| [EntityWrap](../-entity-wrap/index.html) |
| [Destination](../../io.github.kerelape.reikai.io/-destination/index.html) |
| [RandomAccessDestination](../../io.github.kerelape.reikai.io/-random-access-destination/index.html) |
| [RandomAccessSource](../../io.github.kerelape.reikai.io/-random-access-source/index.html) |
| [Source](../../io.github.kerelape.reikai.io/-source/index.html) |


## Extensions


| Name | Summary |
|---|---|
| [toBoolean](../../io.github.kerelape.reikai.logic/to-boolean.html) | [JVM]<br>suspend fun [Entity](index.html).[toBoolean](../../io.github.kerelape.reikai.logic/to-boolean.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert [Entity](index.html) to [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |

