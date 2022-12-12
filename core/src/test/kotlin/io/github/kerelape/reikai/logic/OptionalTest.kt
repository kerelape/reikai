package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.Empty
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Optional].
 *
 * @since 0.2.0
 */
internal class OptionalTest {
    /**
     * Test that it dataizes correctly when the condition is true.
     */
    @Test
    fun `dataizes to value with true condition`() = runBlocking {
        Assertions.assertEquals(
            "abc",
            String(
                Optional(
                    Text("abc"),
                    True
                ).dataize()
            )
        )
    }

    /**
     * Test that is dataizes correctly when the condition is false.
     */
    @Test
    fun `dataizes to Empty when the condition is false`() = runBlocking {
        Assertions.assertTrue(
            Empty.dataize().contentEquals(Optional(Text("abc"), False).dataize())
        )
    }
}
