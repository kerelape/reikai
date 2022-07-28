---
title: io.github.kerelape.reikai.logic
---
//[reikai](../../index.html)/[io.github.kerelape.reikai.logic](index.html)



# Package io.github.kerelape.reikai.logic



## Types


| Name | Summary |
|---|---|
| [False](-false/index.html) | [JVM]<br>object [False](-false/index.html) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>False object that always dataizes as 0. |
| [Fork](-fork/index.html) | [JVM]<br>class [Fork](-fork/index.html)(condition: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), value: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), fallback: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Fork. Selects value or fallback depending on condition. |
| [Identity](-identity/index.html) | [JVM]<br>class [Identity](-identity/index.html)(first: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), second: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Equality of entities. |
| [True](-true/index.html) | [JVM]<br>object [True](-true/index.html) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Truth object that always dataizes as 1. |


## Functions


| Name | Summary |
|---|---|
| [toBoolean](to-boolean.html) | [JVM]<br>suspend fun [Entity](../io.github.kerelape.reikai.core/-entity/index.html).[toBoolean](to-boolean.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert [Entity](../io.github.kerelape.reikai.core/-entity/index.html) to [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |


## Properties


| Name | Summary |
|---|---|
| [asEntity](as-entity.html) | [JVM]<br>val [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html).[asEntity](as-entity.html): [Entity](../io.github.kerelape.reikai.core/-entity/index.html)<br>Entity representation of the [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |

