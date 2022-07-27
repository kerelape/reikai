package io.github.kerelape.reikai.binary

import io.github.kerelape.reikai.extentions.asEntity
import io.github.kerelape.reikai.binary.Xor
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger

/**
 * Test cases for [And].
 *
 * @since 0.0.0
 */
class AndTest {

    /**
     * Test that it works correctly.
     */
    @Test
    fun works() = runBlocking {
        Assertions.assertEquals(
            BigInteger(
                Xor(0b11011.asEntity, 0b10011.asEntity, 0b11001.asEntity).dataize()
            ).toInt(),
            0b10001
        )
    }
}
