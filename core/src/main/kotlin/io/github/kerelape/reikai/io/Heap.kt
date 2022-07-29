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

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity
import java.math.BigInteger
import java.nio.ByteBuffer

/**
 * Heap.
 *
 * @since 0.0.0
 */
class Heap(private val buffer: ByteBuffer) : RandomAccessDestination {
    override suspend fun dataize(): ByteArray {
        return this.buffer.array()
    }

    override suspend fun put(position: Entity, data: Entity): Entity {
        this.buffer.position(BigInteger(position.dataize()).toInt())
        this.buffer.put(data.dataize())
        return data
    }

    override suspend fun get(position: Entity, size: Entity): Entity {
        val data = ByteArray(BigInteger(size.dataize()).toInt())
        this.buffer.position(BigInteger(position.dataize()).toInt())
        this.buffer.get(data)
        return Data(data)
    }
}
