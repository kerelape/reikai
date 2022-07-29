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
package io.github.kerelape.reikai.io.network.http

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.io.Channel
import io.github.kerelape.reikai.io.DynamicHeap
import io.github.kerelape.reikai.io.Row
import io.github.kerelape.reikai.io.Source
import io.github.kerelape.reikai.math.asEntity

/**
 * HTTP channel.
 *
 * @since 0.0.0
 */
class HttpChannel(private val transport: Channel, private val parent: Source) : Channel {
    /**
     * @return Content from the endpoint.
     */
    override suspend fun dataize(): ByteArray {
        val request = Row(DynamicHeap())
        while (true) {
            val chunk = this.transport.dataize()
            if (chunk.last() == 0.toByte()) {
                break
            }
            request.put(Data(chunk))
        }
        return request.dataize()
    }

    /**
     * Put the [data] to the endpoint.
     *
     * @return Response.
     */
    override suspend fun put(data: Entity): Entity {
        this.transport.put(data)
        this.transport.put(0.asEntity)
        return this
    }

    /**
     * Close the underlying transport.
     */
    override suspend fun close(): Source {
        this.transport.close()
        return this.parent
    }
}
