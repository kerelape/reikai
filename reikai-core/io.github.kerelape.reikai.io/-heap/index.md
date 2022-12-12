---
title: Heap
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[Heap](index.html)



# Heap



[JVM]\
class [Heap](index.html)(buffer: [ByteBuffer](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)) : [RandomAccessDestination](../-random-access-destination/index.html)

Heap.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [Heap](-heap.html) | [JVM]<br>fun [Heap](-heap.html)(buffer: [ByteBuffer](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)) |


## Functions


| Name | Summary |
|---|---|
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [get](get.html) | [JVM]<br>open suspend override fun [get](get.html)(position: [Entity](../../io.github.kerelape.reikai/-entity/index.html), size: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Retrieve chunk of data. |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(position: [Entity](../../io.github.kerelape.reikai/-entity/index.html), data: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Put [data](put.html) and the [position](put.html). |

