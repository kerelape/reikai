---
title: RandomAccessDestination
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[RandomAccessDestination](index.html)



# RandomAccessDestination



[JVM]\
interface [RandomAccessDestination](index.html) : [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)

Destination with random access.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>abstract suspend fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [get](get.html) | [JVM]<br>abstract suspend fun [get](get.html)(position: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), size: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Retrieve chunk of data. |
| [put](put.html) | [JVM]<br>abstract suspend fun [put](put.html)(position: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html), data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put [data](put.html) and the [position](put.html). |


## Inheritors


| Name |
|---|
| [DynamicHeap](../-dynamic-heap/index.html) |
| [Heap](../-heap/index.html) |
| [RandomAccessChannel](../-random-access-channel/index.html) |

