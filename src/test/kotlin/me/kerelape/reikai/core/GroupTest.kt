package me.kerelape.reikai.core

import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.text.Text
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
