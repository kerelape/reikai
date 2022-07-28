package io.github.kerelape.reikai.math.strict

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger

/**
 * Test cases for [Integer].
 *
 * @since 0.0.0
 */
class IntegerTest {

    /**
     * Test that [Integer] can wrap a [Long].
     */
    @Test
    fun `wraps long`() = runBlocking {
        Assertions.assertEquals(
            12L,
            BigInteger(
                Integer(12).dataize()
            ).toLong()
        )
    }
}
