package me.kerelape.reikai.text

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.extentions.asEntity

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
