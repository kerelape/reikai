---
title: HttpChannel
---
//[reikai](../../../index.html)/[io.github.kerelape.reikai.io.network.http](../index.html)/[HttpChannel](index.html)



# HttpChannel



[JVM]\
class [HttpChannel](index.html)(transport: [Channel](../../io.github.kerelape.reikai.io/-channel/index.html), parent: [Source](../../io.github.kerelape.reikai.io/-source/index.html)) : [Channel](../../io.github.kerelape.reikai.io/-channel/index.html)

HTTP channel.



#### Since



0.0.0



## Constructors


| | |
|---|---|
| [HttpChannel](-http-channel.html) | [JVM]<br>fun [HttpChannel](-http-channel.html)(transport: [Channel](../../io.github.kerelape.reikai.io/-channel/index.html), parent: [Source](../../io.github.kerelape.reikai.io/-source/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [close](close.html) | [JVM]<br>open suspend override fun [close](close.html)(): [Source](../../io.github.kerelape.reikai.io/-source/index.html)<br>Close the underlying transport. |
| [dataize](dataize.html) | [JVM]<br>open suspend override fun [dataize](dataize.html)(): [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [put](put.html) | [JVM]<br>open suspend override fun [put](put.html)(data: [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)): [Entity](../../io.github.kerelape.reikai.core/-entity/index.html)<br>Put the [data](put.html) to the endpoint. |

