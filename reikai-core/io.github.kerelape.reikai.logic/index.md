---
title: io.github.kerelape.reikai.logic
---
//[reikai-core](../../index.html)/[io.github.kerelape.reikai.logic](index.html)



# Package io.github.kerelape.reikai.logic



## Types


| Name | Summary |
|---|---|
| [Every](-every/index.html) | [JVM]<br>class [Every](-every/index.html)(entities: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Every. [True](-true/index.html) if all elements is [True](-true/index.html). |
| [False](-false/index.html) | [JVM]<br>object [False](-false/index.html) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>False object that always dataizes as 0. |
| [Fork](-fork/index.html) | [JVM]<br>class [Fork](-fork/index.html)(condition: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), value: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), fallback: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Fork. Selects value or fallback depending on condition. |
| [Identity](-identity/index.html) | [JVM]<br>class [Identity](-identity/index.html)(first: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), second: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Equality of entities. |
| [Optional](-optional/index.html) | [JVM]<br>class [Optional](-optional/index.html)(value: [Entity](../io.github.kerelape.reikai.core/-entity/index.html), condition: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Optional entity. Dataizes to the value or [Empty](../io.github.kerelape.reikai.core/-empty/index.html) depending on the condition. Be aware that the first argument is the value, and the second one is the condition. |
| [Some](-some/index.html) | [JVM]<br>class [Some](-some/index.html)(entities: [Entity](../io.github.kerelape.reikai.core/-entity/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Some. [True](-true/index.html) if any of the elements is [True](-true/index.html). |
| [True](-true/index.html) | [JVM]<br>object [True](-true/index.html) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>Truth object that always dataizes as 1. |


## Functions


| Name | Summary |
|---|---|
| [toBoolean](to-boolean.html) | [JVM]<br>suspend fun [Entity](../io.github.kerelape.reikai.core/-entity/index.html).[toBoolean](to-boolean.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert [Entity](../io.github.kerelape.reikai.core/-entity/index.html) to [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |


## Properties


| Name | Summary |
|---|---|
| [asEntity](as-entity.html) | [JVM]<br>val [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html).[asEntity](as-entity.html): [Entity](../io.github.kerelape.reikai.core/-entity/index.html)<br>Entity representation of the [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |

