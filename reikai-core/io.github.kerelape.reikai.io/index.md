---
title: io.github.kerelape.reikai.io
---
//[reikai-core](../../index.html)/[io.github.kerelape.reikai.io](index.html)



# Package io.github.kerelape.reikai.io



## Types


| Name | Summary |
|---|---|
| [Channel](-channel/index.html) | [JVM]<br>interface [Channel](-channel/index.html) : [Destination](-destination/index.html)<br>Destination that can be closed. |
| [Content](-content/index.html) | [JVM]<br>class [Content](-content/index.html)(origin: [RandomAccessSource](-random-access-source/index.html)) : [EntityWrap](../io.github.kerelape.reikai.core/-entity-wrap/index.html)<br>All content of a [RandomAccessSource](-random-access-source/index.html). |
| [Destination](-destination/index.html) | [JVM]<br>interface [Destination](-destination/index.html) : [Entity](../io.github.kerelape.reikai.core/-entity/index.html)<br>Destination of data. |
| [DynamicHeap](-dynamic-heap/index.html) | [JVM]<br>class [DynamicHeap](-dynamic-heap/index.html)(limit: [Entity](../io.github.kerelape.reikai.core/-entity/index.html) = (-1).asEntity) : [RandomAccessDestination](-random-access-destination/index.html)<br>Heap with dynamic size. |
| [Heap](-heap/index.html) | [JVM]<br>class [Heap](-heap/index.html)(buffer: [ByteBuffer](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)) : [RandomAccessDestination](-random-access-destination/index.html)<br>Heap. |
| [Memory](-memory/index.html) | [JVM]<br>class [Memory](-memory/index.html)(origin: [RandomAccessDestination](-random-access-destination/index.html), position: [Entity](../io.github.kerelape.reikai.core/-entity/index.html) = 0.asEntity, size: [Entity](../io.github.kerelape.reikai.core/-entity/index.html) = (-1).asEntity) : [Destination](-destination/index.html)<br>Mutable memory. |
| [RandomAccessChannel](-random-access-channel/index.html) | [JVM]<br>interface [RandomAccessChannel](-random-access-channel/index.html) : [RandomAccessDestination](-random-access-destination/index.html)<br>Random access channel. |
| [RandomAccessDestination](-random-access-destination/index.html) | [JVM]<br>interface [RandomAccessDestination](-random-access-destination/index.html) : [Entity](../io.github.kerelape.reikai.core/-entity/index.html)<br>Destination with random access. |
| [RandomAccessSource](-random-access-source/index.html) | [JVM]<br>interface [RandomAccessSource](-random-access-source/index.html) : [Entity](../io.github.kerelape.reikai.core/-entity/index.html)<br>Source of [RandomAccessChannel](-random-access-channel/index.html)s |
| [Row](-row/index.html) | [JVM]<br>class [Row](-row/index.html) : [Destination](-destination/index.html)<br>Sequence of data. |
| [Source](-source/index.html) | [JVM]<br>interface [Source](-source/index.html) : [Entity](../io.github.kerelape.reikai.core/-entity/index.html)<br>Source of data. |

