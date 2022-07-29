---
title: RandomAccessFileChannel
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io.filesystem](../index.html)/[RandomAccessFileChannel](index.html)



# RandomAccessFileChannel



[JVM]\
class [RandomAccessFileChannel](index.html)(channel: [AsynchronousFileChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousFileChannel.html), parent: [RandomAccessSource](../../io.github.kerelape.reikai.io/-random-access-source/index.html)) : [RandomAccessChannel](../../io.github.kerelape.reikai.io/-random-access-channel/index.html)

Random Access File channel.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [RandomAccessFileChannel](-random-access-file-channel.html) | [JVM]<br>fun [RandomAccessFileChannel](-random-access-file-channel.html)(channel: [AsynchronousFileChannel](https://docs.oracle.com/javase/8/docs/api/java/nio/channels/AsynchronousFileChannel.html), parent: [RandomAccessSource](../../io.github.kerelape.reikai.io/-random-access-source/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [RandomAccessSource](../../io.github.kerelape.reikai.io/-random-access-source/index.html)<br>Close the channel. |
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [get](get.html) | [JVM]<br>open suspend override fun [get](get.html)(position: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), size: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Retrieve chunk of data. |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(position: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put [data](put.html) and the [position](put.html). |

