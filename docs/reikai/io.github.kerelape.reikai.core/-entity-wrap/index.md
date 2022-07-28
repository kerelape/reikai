---
title: EntityWrap
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.core](../index.html)/[EntityWrap](index.html)



# EntityWrap



[JVM]\
abstract class [EntityWrap](index.html)(wrap: [Entity](../-entity/index.html)) : [Entity](../-entity/index.html)

Wrap envelope for [Entity](../-entity/index.html).



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [EntityWrap](-entity-wrap.html) | [JVM]<br>fun [EntityWrap](-entity-wrap.html)(wrap: [Entity](../-entity/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [dataize](../-entity/dataize.html) | [JVM]<br>open suspend override fun [dataize](../-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |


## Inheritors


| Name |
|---|
| [And](../../io.github.kerelape.reikai.binary/-and/index.html) |
| [Not](../../io.github.kerelape.reikai.binary/-not/index.html) |
| [Or](../../io.github.kerelape.reikai.binary/-or/index.html) |
| [Xor](../../io.github.kerelape.reikai.binary/-xor/index.html) |
| [Data](../-data/index.html) |
| [Empty](../-empty/index.html) |
| [Group](../-group/index.html) |
| [Length](../-length/index.html) |
| [Content](../../io.github.kerelape.reikai.io/-content/index.html) |
| [HttpPacket](../../io.github.kerelape.reikai.io.network.http/-http-packet/index.html) |
| [HttpPacketHeader](../../io.github.kerelape.reikai.io.network.http/-http-packet-header/index.html) |
| [HttpRequest](../../io.github.kerelape.reikai.io.network.http/-http-request/index.html) |
| [HttpSource](../../io.github.kerelape.reikai.io.network.http/-http-source/index.html) |
| [Separator](../../io.github.kerelape.reikai.io.network.http/-separator/index.html) |
| [ContentLength](../../io.github.kerelape.reikai.io.network.http.headers/-content-length/index.html) |
| [HttpHeader](../../io.github.kerelape.reikai.io.network.http.headers/-http-header/index.html) |
| [HttpGetPacketHeader](../../io.github.kerelape.reikai.io.network.http.request/-http-get-packet-header/index.html) |
| [HttpRequestPacketHeader](../../io.github.kerelape.reikai.io.network.http.request/-http-request-packet-header/index.html) |
| [False](../../io.github.kerelape.reikai.logic/-false/index.html) |
| [Fork](../../io.github.kerelape.reikai.logic/-fork/index.html) |
| [Identity](../../io.github.kerelape.reikai.logic/-identity/index.html) |
| [True](../../io.github.kerelape.reikai.logic/-true/index.html) |
| [Integer](../../io.github.kerelape.reikai.math.strict/-integer/index.html) |
| [Sum](../../io.github.kerelape.reikai.math.strict/-sum/index.html) |
| [IntegerAsText](../../io.github.kerelape.reikai.text/-integer-as-text/index.html) |
| [Newline](../../io.github.kerelape.reikai.text/-newline/index.html) |
| [Space](../../io.github.kerelape.reikai.text/-space/index.html) |
| [Sprintf](../../io.github.kerelape.reikai.text/-sprintf/index.html) |
| [Text](../../io.github.kerelape.reikai.text/-text/index.html) |
