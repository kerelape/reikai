package me.kerelape.reikai.text

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlinx.coroutines.runBlocking

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
