---
title: DynamicHeap
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[DynamicHeap](index.html)



# DynamicHeap



[JVM]\
class [DynamicHeap](index.html)(limit: [Entity](../../io.github.kerelape.reikai/-entity/index.html) = (-1).asEntity) : [RandomAccessDestination](../-random-access-destination/index.html)

Heap with dynamic size.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [DynamicHeap](-dynamic-heap.html) | [JVM]<br>fun [DynamicHeap](-dynamic-heap.html)(limit: [Entity](../../io.github.kerelape.reikai/-entity/index.html) = (-1).asEntity) |


## Functions


| Name | Summary |
|---|---|
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [get](get.html) | [JVM]<br>open suspend override fun [get](get.html)(position: [Entity](../../io.github.kerelape.reikai/-entity/index.html), size: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Retrieve chunk of data. |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(position: [Entity](../../io.github.kerelape.reikai/-entity/index.html), data: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Put [data](put.html) and the [position](put.html). |

