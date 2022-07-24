package io.github.kerelape.reikai.extentions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for Entity extensions.
 *
 * @since 0.0.0
 */
internal class EntityExtensionsTest {

    /**
     * Test that [toBoolean] converts to true correctly.
     */
    @Test
    fun `convert to true correctly`() = runBlocking {
        Assertions.assertTrue(4321.asEntity.toBoolean())
    }

    /**
     * Test that [toBoolean] converts to false correctly.
     */
    @Test
    fun `convert to false correctly`() = runBlocking {
        Assertions.assertFalse(0.asEntity.toBoolean())
    }
}
