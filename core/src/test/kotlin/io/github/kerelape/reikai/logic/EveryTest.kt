package io.github.kerelape.reikai.logic

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Every].
 *
 * @since 0.0.0
 */
internal class EveryTest {
    /**
     * Test that it is [True] for all [True].
     */
    @Test
    fun `true for all true`() = runBlocking {
        Assertions.assertTrue(
            Every(True, True, True).toBoolean()
        )
    }

    /**
     * Test that it is [False] for one [False].
     */
    @Test
    fun `false for one false`() = runBlocking {
        Assertions.assertFalse(
            Every(False, True, True).toBoolean()
        )
    }

    /**
     * Test that it is [False] for all [False].
     */
    @Test
    fun `false for all false`() = runBlocking {
        Assertions.assertFalse(
            Every(False, False, False).toBoolean()
        )
    }
}
