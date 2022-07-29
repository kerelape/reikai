---
title: Destination
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[Destination](index.html)



# Destination



[JVM]\
interface [Destination](index.html) : [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)

Destination of data.



#### Since



0.0.0



## Functions


| Name | Summary |
|---|---|
| [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html) | [JVM]<br>abstract suspend fun [dataize](../../io.github.kerelape.reikai.core/-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [put](put.html) | [JVM]<br>abstract suspend fun [put](put.html)(data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put arbitrary [data](put.html) to the destination. |


## Inheritors


| Name |
|---|
| [Channel](../-channel/index.html) |
| [Memory](../-memory/index.html) |
| [Row](../-row/index.html) |

