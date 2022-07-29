---
title: Channel
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[Channel](index.html)



# Channel



[JVM]\
interface [Channel](index.html) : [Destination](../-destination/index.html)

Destination that can be closed.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>abstract suspend fun [close](close.html)(): [Source](../-source/index.html)<br>Close the channel. |
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>abstract suspend fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [put](../-destination/put.html) | [JVM]<br>abstract suspend fun [put](../-destination/put.html)(data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put arbitrary [data](../-destination/put.html) to the destination. |


## Inheritors


| Name |
|---|
| [TcpChannel](../../io.github.kerelape.reikai.io.network/-tcp-channel/index.html) |
| [HttpChannel](../../io.github.kerelape.reikai.io.network.http/-http-channel/index.html) |

