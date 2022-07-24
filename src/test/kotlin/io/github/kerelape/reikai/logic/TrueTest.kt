package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.extentions.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [True].
 *
 * @since 0.0.0
 */
class TrueTest {

    /**
     * Test that [True] equals to true.
     */
    @Test
    fun `equals to true`() = runBlocking {
        Assertions.assertEquals(
            true.asEntity.dataize()[0],
            True.dataize()[0]
        )
    }
}