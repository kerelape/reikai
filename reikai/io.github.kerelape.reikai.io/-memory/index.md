---
title: Memory
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[Memory](index.html)



# Memory



[JVM]\
class [Memory](index.html)(origin: [RandomAccessDestination](../-random-access-destination/index.html), position: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html) = 0.asEntity, size: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html) = (-1).asEntity) : [Destination](../-destination/index.html)

Mutable memory.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [Memory](-memory.html) | [JVM]<br>fun [Memory](-memory.html)(origin: [RandomAccessDestination](../-random-access-destination/index.html), position: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html) = 0.asEntity, size: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html) = (-1).asEntity) |


## Functions


| Name | Summary |
|---|---|
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put arbitrary [data](put.html) to the destination. |

