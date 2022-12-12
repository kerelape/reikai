---
title: TcpEndpoint
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io.network](../index.html)/[TcpEndpoint](index.html)



# TcpEndpoint



[JVM]\
class [TcpEndpoint](index.html)(address: [Entity](../../io.github.kerelape.reikai/-entity/index.html), port: [Entity](../../io.github.kerelape.reikai/-entity/index.html)) : [Endpoint](../-endpoint/index.html)

Socket endpoint.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [TcpEndpoint](-tcp-endpoint.html) | [JVM]<br>fun [TcpEndpoint](-tcp-endpoint.html)(address: [Entity](../../io.github.kerelape.reikai/-entity/index.html), port: [Entity](../../io.github.kerelape.reikai/-entity/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Does nothing. |
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [listen](listen.html) | [JVM]<br>open suspend override fun [listen](listen.html)(): [Source](../../io.github.kerelape.reikai.io/-source/index.html)<br>Start listening on the endpoint. |
| [open](open.html) | [JVM]<br>open suspend override fun [open](open.html)(): [Channel](../../io.github.kerelape.reikai.io/-channel/index.html)<br>Connect to the endpoint. |

