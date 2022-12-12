---
title: Row
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.io](../index.html)/[Row](index.html)



# Row



[JVM]\
class [Row](index.html)(origin: [RandomAccessDestination](../-random-access-destination/index.html)) : [Destination](../-destination/index.html)

Sequence of data.







#### Since



0.0.0



## Constructors


| | |
|---|---|
| [Row](-row.html) | [JVM]<br>fun [Row](-row.html)(origin: [RandomAccessDestination](../-random-access-destination/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(data: [Entity](../../io.github.kerelape.reikai/-entity/index.html)): [Entity](../../io.github.kerelape.reikai/-entity/index.html)<br>Append [data](put.html). |

