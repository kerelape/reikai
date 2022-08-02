---
title: DataizationException
---
//[reikai-core](../../../index.html)/[io.github.kerelape.reikai.core](../index.html)/[DataizationException](index.html)



# DataizationException



[JVM]\
class [DataizationException](index.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)

Dataization exception. Thrown when an entity could not be dataized for a reason.



#### Since



0.2.0



## Constructors


| | |
|---|---|
| [DataizationException](-dataization-exception.html) | [JVM]<br>fun [DataizationException](-dataization-exception.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [addSuppressed](index.html#282858770%2FFunctions%2F417447919) | [JVM]<br>fun [addSuppressed](index.html#282858770%2FFunctions%2F417447919)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](index.html#-1102069925%2FFunctions%2F417447919) | [JVM]<br>open fun [fillInStackTrace](index.html#-1102069925%2FFunctions%2F417447919)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](index.html#1043865560%2FFunctions%2F417447919) | [JVM]<br>open fun [getLocalizedMessage](index.html#1043865560%2FFunctions%2F417447919)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](index.html#2050903719%2FFunctions%2F417447919) | [JVM]<br>open fun [getStackTrace](index.html#2050903719%2FFunctions%2F417447919)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](index.html#672492560%2FFunctions%2F417447919) | [JVM]<br>fun [getSuppressed](index.html#672492560%2FFunctions%2F417447919)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](index.html#-418225042%2FFunctions%2F417447919) | [JVM]<br>open fun [initCause](index.html#-418225042%2FFunctions%2F417447919)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](index.html#-1769529168%2FFunctions%2F417447919) | [JVM]<br>open fun [printStackTrace](index.html#-1769529168%2FFunctions%2F417447919)()<br>open fun [printStackTrace](index.html#1841853697%2FFunctions%2F417447919)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](index.html#1175535278%2FFunctions%2F417447919)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](index.html#2135801318%2FFunctions%2F417447919) | [JVM]<br>open fun [setStackTrace](index.html#2135801318%2FFunctions%2F417447919)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [cause](index.html#-654012527%2FProperties%2F417447919) | [JVM]<br>open val [cause](index.html#-654012527%2FProperties%2F417447919): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](index.html#1824300659%2FProperties%2F417447919) | [JVM]<br>open val [message](index.html#1824300659%2FProperties%2F417447919): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

