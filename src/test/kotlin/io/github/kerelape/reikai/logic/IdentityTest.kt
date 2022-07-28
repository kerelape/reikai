package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.extentions.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Identity].
 *
 * @since 0.0.0
 */
class IdentityTest {

    /**
     * Test that it returns true.
     */
    @Test
    fun `works for similar objects`() = runBlocking {
        Assertions.assertTrue(
            Identity(1.asEntity, 1.asEntity).toBoolean()
        )
    }

    /**
     * Test that it returns false.
     */
    @Test
    fun `works for different objects`() = runBlocking {
        Assertions.assertFalse(
            Identity(0.asEntity, 1.asEntity).toBoolean()
        )
    }
}
