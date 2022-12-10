package io.github.kerelape.reikai.core

import io.github.kerelape.reikai.logic.True
import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [StructGuard].
 *
 * @since 0.2.0
 */
internal class StructGuardTest {

    /**
     * Test that it fails when the provided struct is not as long as expected.
     */
    @Test
    fun `fails with too long struct`() {
        try {
            runBlocking {
                StructGuard(
                    Struct(True),
                    2.asEntity,
                    Text("Too short struct!"),
                    Empty
                ).dataize()
            }
            Assertions.fail("Did not fail")
        } catch (exception: Exception) {
            Assertions.assertEquals("Too short struct!", exception.message)
        }
    }

    /**
     * Test that it fails when the provided struct is too long.
     */
    @Test
    fun `fails with too short struct`() {
        try {
            runBlocking {
                StructGuard(
                    Struct(True, True),
                    1.asEntity,
                    Text("Too long struct!"),
                    Empty
                ).dataize()
            }
            Assertions.fail("Did not fail")
        } catch (exception: Exception) {
            Assertions.assertEquals("Too long struct!", exception.message)
        }
    }

    /**
     * Test that it works with corrects struct.
     */
    @Test
    fun `proceeds with fine struct`() {
        runBlocking {
            Assertions.assertEquals(
                "Abcdefu",
                runBlocking {
                    String(
                        StructGuard(
                            Text("Abcdefu"),
                            Length(Text("Abcdefu")),
                            Text("?"),
                            Text("Abcdefu")
                        ).dataize()
                    )
                }
            )
        }
    }
}
