---
title: Source
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[Source](index.html)



# Source



[JVM]\
interface [Source](index.html) : [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)

Source of data.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>abstract suspend fun [close](close.html)(): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Close the source. |
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>abstract suspend fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [open](open.html) | [JVM]<br>abstract suspend fun [open](open.html)(): [Channel](../-channel/index.html)<br>Open a channel on this source. |


## Inheritors


| Name |
|---|
| [Endpoint](../../io.github.kerelape.reikai.io.network/-endpoint/index.html) |
| [TcpSource](../../io.github.kerelape.reikai.io.network/-tcp-source/index.html) |
| [HttpSource](../../io.github.kerelape.reikai.io.network.http/-http-source/index.html) |

