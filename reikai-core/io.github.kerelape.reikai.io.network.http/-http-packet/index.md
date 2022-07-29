---
title: HttpPacket
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io.network.http](../index.html)/[HttpPacket](index.html)



# HttpPacket



[JVM]\
class [HttpPacket](index.html)(header: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), body: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html) = Empty) : [EntityWrap](../../io.github.kerelape.reikai.core/-entity-wrap/index.html)

HTTP packet.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [HttpPacket](-http-packet.html) | [JVM]<br>fun [HttpPacket](-http-packet.html)(header: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), body: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html) = Empty) |


## Functions


| Name | Summary |
|---|---|
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>open suspend override fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |

