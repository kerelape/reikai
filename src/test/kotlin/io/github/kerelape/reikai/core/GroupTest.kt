package io.github.kerelape.reikai.core

import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Group].
 *
 * @since 0.0.0
 */
class GroupTest {

    /**
     * Test that it concatenates.
     */
    @Test
    fun concatenates() = runBlocking {
        Assertions.assertEquals(
            "Hello, World!",
            String(
                Group(
                    Text("Hello, "),
                    Text("World!")
                ).dataize()
            )
        )
    }
}
