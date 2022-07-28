package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Fork].
 *
 * @since 0.0.0
 */
class ForkTest {

    /**
     * Test that it works for true.
     */
    @Test
    fun `can choose value`() = runBlocking {
        Assertions.assertEquals(
            "value",
            String(
                Fork(
                    True,
                    "value".asEntity,
                    0.asEntity
                ).dataize()
            )
        )
    }

    /**
     * Test that it works for false.
     */
    @Test
    fun `can choose fallback`() = runBlocking {
        Assertions.assertEquals(
            "fallback",
            String(
                Fork(
                    False,
                    0.asEntity,
                    "fallback".asEntity
                ).dataize()
            )
        )
    }
}