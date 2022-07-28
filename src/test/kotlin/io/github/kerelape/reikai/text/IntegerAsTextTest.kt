package io.github.kerelape.reikai.text

import io.github.kerelape.reikai.math.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [IntegerAsText].
 *
 * @since 0.0.0
 */
class IntegerAsTextTest {

    /**
     * Test that [IntegerAsText] equals to [Text].
     */
    @Test
    fun `equals to text`() = runBlocking {
        Assertions.assertEquals(
            "12",
            String(
                IntegerAsText(12.asEntity).dataize()
            )
        )
    }
}
