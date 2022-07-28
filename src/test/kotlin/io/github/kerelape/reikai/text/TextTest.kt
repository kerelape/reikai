package io.github.kerelape.reikai.text

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Text].
 *
 * @since 0.0.0
 */
class TextTest {

    /**
     * Test that [String] can wrap a [Text].
     */
    @Test
    fun `wraps by string`() = runBlocking {
        Assertions.assertEquals(
            "Hello, мир!",
            String(
                Text("Hello, мир!").dataize()
            )
        )
    }
}
