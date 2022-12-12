---
title: RandomAccessChannel
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[RandomAccessChannel](index.html)



# RandomAccessChannel



[JVM]\
interface [RandomAccessChannel](index.html) : [RandomAccessDestination](../-random-access-destination/index.html)

Random access channel.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>abstract suspend fun [close](close.html)(): [RandomAccessSource](../-random-access-source/index.html)<br>Close the channel. |
| [dataize](../../io.github.kerelape.reikai/-entity/dataize.html) | [JVM]<br>abstract suspend fun [dataize](../../io.github.kerelape.reikai/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [get](../-random-access-destination/get.html) | [JVM]<br>abstract suspend fun [get](../-random-access-destination/get.html)(position: [Entity](../../io.github.kerelape.reikai/-entity/index.html), size: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Retrieve chunk of data. |
| [put](../-random-access-destination/put.html) | [JVM]<br>abstract suspend fun [put](../-random-access-destination/put.html)(position: [Entity](../../io.github.kerelape.reikai/-entity/index.html), data: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Put [data](../-random-access-destination/put.html) and the [position](../-random-access-destination/put.html). |


## Inheritors


| Name |
|---|
| [RandomAccessFileChannel](../../io.github.kerelape.reikai.io.filesystem/-random-access-file-channel/index.html) |

