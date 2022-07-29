---
title: Endpoint
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io.network](../index.html)/[Endpoint](index.html)



# Endpoint



[JVM]\
interface [Endpoint](index.html) : [Source](../../io.github.kerelape.reikai.io/-source/index.html)

Endpoint.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [close](../../io.github.kerelape.reikai.io/-source/close.html) | [JVM]<br>abstract suspend fun [close](../../io.github.kerelape.reikai.io/-source/close.html)(): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Close the source. |
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>abstract suspend fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [listen](listen.html) | [JVM]<br>abstract suspend fun [listen](listen.html)(): [Source](../../io.github.kerelape.reikai.io/-source/index.html)<br>Listen for incoming connections. |
| [open](../../io.github.kerelape.reikai.io/-source/open.html) | [JVM]<br>abstract suspend fun [open](../../io.github.kerelape.reikai.io/-source/open.html)(): [Channel](../../io.github.kerelape.reikai.io/-channel/index.html)<br>Open a channel on this source. |


## Inheritors


| Name |
|---|
| [TcpEndpoint](../-tcp-endpoint/index.html) |

