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

import io.github.kerelape.reikai.core.Entity

/**
 * Sequence of data.
 *
 * @todo #30 Make use of Random Access Destination instead of Array List.
 *  The destination must be passed through the constructor.
 * @since 0.0.0
 */
class Row : Destination {
    private val accumulator = arrayListOf<Byte>()

    override suspend fun dataize(): ByteArray {
        return this.accumulator.toByteArray()
    }

    /**
     * Append [data].
     *
     * @return This object with [data] appended.
     */
    override suspend fun put(data: Entity): Entity {
        this.accumulator.addAll(data.dataize().toList())
        return this
    }
}
