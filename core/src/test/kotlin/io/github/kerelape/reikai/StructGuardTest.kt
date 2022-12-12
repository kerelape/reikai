package io.github.kerelape.reikai

import io.github.kerelape.reikai.logic.True
import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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
        assertThrows<DataizationException> {
            runBlocking {
                StructGuard(
                    Struct(True),
                    2.asEntity,
                    Text("Too short struct!"),
                    Empty
                ).dataize()
            }
        }
    }

    /**
     * Test that it fails when the provided struct is too long.
     */
    @Test
    fun `fails with too short struct`() {
        assertThrows<DataizationException> {
            runBlocking {
                StructGuard(
                    Struct(True, True),
                    1.asEntity,
                    Text("Too long struct!"),
                    Empty
                ).dataize()
            }
        }
    }

    /**
     * Test that it works with corrects struct.
     */
    @Test
    fun `proceeds with fine struct`() {
        Assertions.assertEquals(
            "Abcdefu",
            String(
                runBlocking {
                    StructGuard(
                        Text("Abcdefu"),
                        Length(Text("Abcdefu")),
                        Text("?"),
                        Text("Abcdefu")
                    ).dataize()
                }
            )
        )
    }
}
