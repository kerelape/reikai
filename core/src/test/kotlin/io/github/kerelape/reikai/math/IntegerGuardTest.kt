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
package io.github.kerelape.reikai.math

import io.github.kerelape.reikai.Data
import io.github.kerelape.reikai.DataizationException
import io.github.kerelape.reikai.Empty
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 * Test cases for [IntegerGuard].
 *
 * @since 0.2.0
 */
internal class IntegerGuardTest {
    /**
     * Test the guard fails with too long integer.
     */
    @Test
    fun `fails with too long integer`() {
        assertThrows<DataizationException> {
            runBlocking {
                IntegerGuard(Data(byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)), Empty).dataize()
            }
        }
    }

    /**
     * Test the guard fails with too short integer.
     */
    @Test
    fun `fails with too short integer`() {
        assertThrows<DataizationException> {
            runBlocking {
                IntegerGuard(Empty, Empty).dataize()
            }
        }
    }

    /**
     * Test the guard proceeds with a fine integer.
     */
    @Test
    fun `proceeds with fine integer`() {
        Assertions.assertEquals(
            "Abc",
            String(
                runBlocking {
                    IntegerGuard(
                        Data(byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0)),
                        Text("Abc")
                    ).dataize()
                }
            )
        )
    }
}
