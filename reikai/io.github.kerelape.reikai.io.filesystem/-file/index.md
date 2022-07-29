---
title: File
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.io.filesystem](../index.html)/[File](index.html)



# File



[JVM]\
class [File](index.html)(path: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), options: [OpenOption](https://docs.oracle.com/javase/8/docs/api/java/nio/file/OpenOption.html)) : [RandomAccessSource](../../io.github.kerelape.reikai.io/-random-access-source/index.html)

File.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [File](-file.html) | [JVM]<br>fun [File](-file.html)(path: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), vararg options: [OpenOption](https://docs.oracle.com/javase/8/docs/api/java/nio/file/OpenOption.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Does nothing. |
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [open](open.html) | [JVM]<br>open suspend override fun [open](open.html)(): [RandomAccessChannel](../../io.github.kerelape.reikai.io/-random-access-channel/index.html)<br>Open channel. |

