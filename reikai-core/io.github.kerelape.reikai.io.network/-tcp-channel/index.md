---
title: TcpChannel
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io.network](../index.html)/[TcpChannel](index.html)



# TcpChannel



[JVM]\
class [TcpChannel](index.html)(socket: [AsynchronousSocketChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousSocketChannel.html), parent: [Source](../../io.github.kerelape.reikai.io/-source/index.html)) : [Channel](../../io.github.kerelape.reikai.io/-channel/index.html)

TCP destination.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [TcpChannel](-tcp-channel.html) | [JVM]<br>fun [TcpChannel](-tcp-channel.html)(socket: [AsynchronousSocketChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousSocketChannel.html), parent: [Source](../../io.github.kerelape.reikai.io/-source/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [Source](../../io.github.kerelape.reikai.io/-source/index.html)<br>Close the underlying [AsynchronousSocketChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousSocketChannel.html). |
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Read next chunk of data from the socket. |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put arbitrary data to the socket channel. |

