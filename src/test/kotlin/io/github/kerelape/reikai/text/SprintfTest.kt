package io.github.kerelape.reikai.text

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Sprintf].
 *
 * @since 0.0.0
 */
class SprintfTest {

    /**
     * Test that [Sprintf] converts to correct [String].
     */
    @Test
    fun `converts to string`() = runBlocking {
        Assertions.assertEquals(
            "Hello, мир!",
            String(
                Sprintf(Text("%s, %s!"), Text("Hello"), Text("мир")).dataize()
            )
        )
    }
}
