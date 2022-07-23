package me.kerelape.reikai.logic

import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.extentions.asEntity
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
            0.toByte(),
            Not(Not(0.asEntity)).dataize()[0]
        )
    }
}
