package me.kerelape.reikai.logic

import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.extentions.asEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Equality].
 *
 * @since 0.0.0
 */
class EqualityTest {

    /**
     * Test that it returns true.
     */
    @Test
    fun `works for similar objects`() = runBlocking {
        Assertions.assertNotEquals(
            0,
            Equality(
                1.asEntity,
                1.asEntity
            ).dataize()[0]
        )
    }

    /**
     * Test that it returns false.
     */
    @Test
    fun `works for different objects`() = runBlocking {
        Assertions.assertEquals(
            0,
            Equality(
                2412.asEntity,
                3561.asEntity
            ).dataize()[0]
        )
    }
}
