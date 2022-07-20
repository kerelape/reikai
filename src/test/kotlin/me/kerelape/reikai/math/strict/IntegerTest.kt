package me.kerelape.reikai.math.strict

import java.math.BigInteger
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlinx.coroutines.runBlocking

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
