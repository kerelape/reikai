package io.github.kerelape.reikai

import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Error].
 *
 * @since 0.2.0
 */
internal class ErrorTest {

    @Test
    fun `throws DataizationException when dataizes`() {
        Assertions.assertThrows(DataizationException::class.java) {
            runBlocking {
                Error().dataize()
            }
        }
    }

    @Test
    fun `thrown exceptions contains correct message`() = runBlocking {
        try {
            Error(Text("abc")).dataize()
        } catch (exception: DataizationException) {
            Assertions.assertEquals(
                "abc",
                exception.message
            )
        }
    }
}
