package io.github.kerelape.reikai.logic

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [False].
 *
 * @since 0.0.0
 */
class FalseTest {

    /**
     * Test that [False] equals to false.
     */
    @Test
    fun `equals to false`() = runBlocking {
        Assertions.assertEquals(
            false.asEntity.dataize()[0],
            False.dataize()[0]
        )
    }
}
