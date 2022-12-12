/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 kerelape
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.Data
import io.github.kerelape.reikai.Entity
import io.github.kerelape.reikai.math.asEntity
import java.math.BigInteger

/**
 * Heap with dynamic size.
 *
 * @since 0.0.0
 */
class DynamicHeap(private val limit: Entity = (-1).asEntity) : RandomAccessDestination {
    private val heap = arrayListOf<Byte>()

    override suspend fun dataize(): ByteArray {
        return this.heap.toByteArray()
    }

    override suspend fun put(position: Entity, data: Entity): Entity {
        val pos = BigInteger(position.dataize()).toInt()
        val dat = data.dataize()
        val limit = BigInteger(this.limit.dataize()).toInt()
        if (pos + dat.size > limit && limit != -1) {
            throw IllegalArgumentException("Out of limit")
        }
        return try {
            this.heap.addAll(pos, dat.toList())
            Data(dat)
        } catch (exception: IndexOutOfBoundsException) {
            val zeros = ByteArray(pos - this.heap.size) { 0 }
            this.heap.addAll(this.heap.size, zeros.toList())
            this.put(position, Data(dat))
        }
    }

    override suspend fun get(position: Entity, size: Entity): Entity {
        val start = BigInteger(position.dataize())
        val end = start.add(BigInteger(size.dataize()))
        return Data(this.heap.subList(start.toInt(), end.toInt()).toByteArray())
    }
}
