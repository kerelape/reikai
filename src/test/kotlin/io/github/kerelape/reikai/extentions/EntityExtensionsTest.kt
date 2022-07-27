package io.github.kerelape.reikai.extentions

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.core.Empty
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
     * Test that [toBoolean] converts zero to false.
     */
    @Test
    fun `convert zero to false`() = runBlocking {
        Assertions.assertFalse(0.asEntity.toBoolean())
    }

    /**
     * Test that [toBoolean] converts bytearray of zeros to false.
     */
    @Test
    fun `convert bytearray of zeros to false`() = runBlocking {
        Assertions.assertFalse(Data(byteArrayOf(0, 0, 0)).toBoolean())
    }

    /**
     * Test that [toBoolean] converts [Empty] to false.
     *
     * @origin #50
     */
    @Test
    fun `converts Empty to false`() = runBlocking {
        Assertions.assertFalse(Empty.toBoolean())
    }
}
