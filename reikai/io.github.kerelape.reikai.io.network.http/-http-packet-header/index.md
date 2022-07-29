---
title: HttpPacketHeader
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.io.network.http](../index.html)/[HttpPacketHeader](index.html)



# HttpPacketHeader



[JVM]\
class [HttpPacketHeader](index.html)(type: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), headers: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../../io.github.kerelape.reikai.core/-entity-wrap/index.html)

General HTTP packet header.



#### Since



0.0.0



## Parameters


JVM

| | |
|---|---|
| type | First line of the header. |
| headers | HTTP headers. |



## Constructors


| | |
|---|---|
| [HttpPacketHeader](-http-packet-header.html) | [JVM]<br>fun [HttpPacketHeader](-http-packet-header.html)(type: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), vararg headers: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>open suspend override fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |

