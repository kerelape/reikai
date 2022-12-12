---
title: io.github.kerelape.reikai.core
---
//[reikai-core](../../index.html)/[io.github.kerelape.reikai.core](index.html)



# Package io.github.kerelape.reikai.core



## Types


| Name | Summary |
|---|---|
| [Data](-data/index.html) | [JVM]<br>class [Data](-data/index.html)(bytes: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>Simple data entity. |
| [DataizationException](-dataization-exception/index.html) | [JVM]<br>class [DataizationException](-dataization-exception/index.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)<br>Dataization exception. Thrown when an entity could not be dataized for a reason. |
| [Empty](-empty/index.html) | [JVM]<br>object [Empty](-empty/index.html) : [EntityWrap](-entity-wrap/index.html)<br>Empty entity. |
| [Entity](-entity/index.html) | [JVM]<br>fun interface [Entity](-entity/index.html)<br>Basic type in Reikai. Alternative to Object. |
| [EntityWrap](-entity-wrap/index.html) | [JVM]<br>abstract class [EntityWrap](-entity-wrap/index.html)(wrap: [Entity](-entity/index.html)) : [Entity](-entity/index.html)<br>Wrap envelope for [Entity](-entity/index.html). |
| [Error](-error/index.html) | [JVM]<br>class [Error](-error/index.html)(message: [Entity](-entity/index.html) = Empty) : [EntityWrap](-entity-wrap/index.html)<br>Error. |
| [Length](-length/index.html) | [JVM]<br>class [Length](-length/index.html)(origin: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>Length of the entity. |
| [Struct](-struct/index.html) | [JVM]<br>class [Struct](-struct/index.html)(items: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>Sequence of entities. |
| [StructGuard](-struct-guard/index.html) | [JVM]<br>class [StructGuard](-struct-guard/index.html)(origin: [Entity](-entity/index.html), length: [Entity](-entity/index.html), message: [Entity](-entity/index.html), continuation: [Entity](-entity/index.html)) : [EntityWrap](-entity-wrap/index.html)<br>StructGuard. |


## Properties


| Name | Summary |
|---|---|
| [asEntity](as-entity.html) | [JVM]<br>val [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html).[asEntity](as-entity.html): [Entity](-entity/index.html)<br>Entity representation of the [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html). |

