---
title: TcpSource
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io.network](../index.html)/[TcpSource](index.html)



# TcpSource



[JVM]\
class [TcpSource](index.html)(channel: [AsynchronousServerSocketChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousServerSocketChannel.html)) : [Source](../../io.github.kerelape.reikai.io/-source/index.html)

Source of TCP connections.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [TcpSource](-tcp-source.html) | [JVM]<br>fun [TcpSource](-tcp-source.html)(channel: [AsynchronousServerSocketChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousServerSocketChannel.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Close the underlying [AsynchronousServerSocketChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousServerSocketChannel.html). |
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [open](open.html) | [JVM]<br>open suspend override fun [open](open.html)(): [Channel](../../io.github.kerelape.reikai.io/-channel/index.html) |

