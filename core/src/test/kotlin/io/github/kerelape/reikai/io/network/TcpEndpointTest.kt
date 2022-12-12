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
package io.github.kerelape.reikai.io.network

import io.github.kerelape.reikai.Data
import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.asEntity
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [TcpEndpoint].
 *
 * @since 0.0.0
 */
internal class TcpEndpointTest {
    /**
     * Test that the endpoint works.
     */
    @Test
    fun `test works`(): Unit = runBlocking {
        val endpoint = TcpEndpoint("localhost".asEntity, 8080.asEntity)
        val server = endpoint.listen()
        launch {
            val connection = server.open()
            connection.put(connection)
        }
        val client = endpoint.open()
        client.put(Data(byteArrayOf(32)))
        Assertions.assertEquals(32.toByte(), client.dataize()[0])
        server.close()
    }

    @Test
    fun `dataizes to address`() = runBlocking {
        Assertions.assertEquals(
            "localhost:8080",
            String(
                TcpEndpoint(
                    "localhost".asEntity,
                    8080.asEntity
                ).dataize()
            )
        )
    }

    @Test
    fun `close returns false`() = runBlocking {
        Assertions.assertEquals(
            0,
            TcpEndpoint(0.asEntity, 0.asEntity).close().dataize()[0]
        )
    }
}
