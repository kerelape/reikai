---
title: Data
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai](../index.html)/[Data](index.html)



# Data



[JVM]\
class [Data](index.html)(bytes: [Entity](../-entity/index.html)) : [EntityWrap](../-entity-wrap/index.html)

Simple data entity.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [Data](-data.html) | [JVM]<br>fun [Data](-data.html)(bytes: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)) |
| [Data](-data.html) | [JVM]<br>fun [Data](-data.html)(buffer: [ByteBuffer](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)) |
| [Data](-data.html) | [JVM]<br>fun [Data](-data.html)(bytes: [Entity](../-entity/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [dataize](../-entity/dataize.html) | [JVM]<br>open suspend override fun [dataize](../-entity/dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Representation of the object in bytes. |

