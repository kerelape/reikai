---
title: HttpSource
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.io.network.http](../index.html)/[HttpSource](index.html)



# HttpSource



[JVM]\
class [HttpSource](index.html)(transport: [Source](../../io.github.kerelape.reikai.io/-source/index.html)) : [EntityWrap](../../io.github.kerelape.reikai.core/-entity-wrap/index.html), [Source](../../io.github.kerelape.reikai.io/-source/index.html)

Source of HTTP channels.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [HttpSource](-http-source.html) | [JVM]<br>fun [HttpSource](-http-source.html)(transport: [Source](../../io.github.kerelape.reikai.io/-source/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Close the underlying transport. |
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>open suspend override fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [open](open.html) | [JVM]<br>open suspend override fun [open](open.html)(): [Channel](../../io.github.kerelape.reikai.io/-channel/index.html)<br>Open a new HttpChannel. |

