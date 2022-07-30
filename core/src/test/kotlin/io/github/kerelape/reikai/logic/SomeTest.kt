package io.github.kerelape.reikai.logic

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Some].
 *
 * @since 0.0.0
 */
internal class SomeTest {
    /**
     * Test that it is [True] for one [True].
     */
    @Test
    fun `true for one true`() = runBlocking {
        Assertions.assertTrue(
            Some(True, False, False).toBoolean()
        )
    }

    /**
     * Test that it is [True] for all [True].
     */
    @Test
    fun `true for all true`() = runBlocking {
        Assertions.assertTrue(
            Some(True, True, True).toBoolean()
        )
    }

    /**
     * Test that it is [False] for all [False].
     */
    @Test
    fun `false for all false`() = runBlocking {
        Assertions.assertFalse(
            Some(False, False, False).toBoolean()
        )
    }
}
