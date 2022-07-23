package me.kerelape.reikai.logic

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Not].
 *
 * @since 0.0.0
 */
class NotTest {

    /**
     * Test that it inverts correctly.
     */
    @Test
    fun inverts() = runBlocking {
        Assertions.assertEquals(
            Equality(
                Not(True),
                False
            ).dataize()[0],
            True.dataize()[0]
        )
    }
}
