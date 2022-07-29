---
title: io.github.kerelape.reikai.core
---
//[reikai-core](../../index.html)/[io.github.kerelape.reikai.core](index.html)



# Package io.github.kerelape.reikai.core



## Types


| Name | Summary |
|---|---|
| [Data](-data/index.html) | [JVM]<br>class [Data](-data/index.html)(bytes: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>Simple data entity. |
| [Empty](-empty/index.html) | [JVM]<br>object [Empty](-empty/index.html) : [EntityWrap](-entity-wrap/index.html)<br>Empty entity. |
| [Entity](-entity/index.html) | [JVM]<br>fun interface [Entity](-entity/index.html)<br>Basic type in Reikai. Alternative to Object. |
| [EntityWrap](-entity-wrap/index.html) | [JVM]<br>abstract class [EntityWrap](-entity-wrap/index.html)(wrap: [Entity](-entity/index.html)) : [Entity](-entity/index.html)<br>Wrap envelope for [Entity](-entity/index.html). |
| [Group](-group/index.html) | [JVM]<br>class [Group](-group/index.html)(items: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>Concatenates items. |
| [Length](-length/index.html) | [JVM]<br>class [Length](-length/index.html)(origin: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>Length of the entity. |


## Properties


| Name | Summary |
|---|---|
| [asEntity](as-entity.html) | [JVM]<br>val [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html).[asEntity](as-entity.html): [Entity](-entity/index.html)<br>Entity representation of the [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html). |

