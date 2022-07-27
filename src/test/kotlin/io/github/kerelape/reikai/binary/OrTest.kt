package io.github.kerelape.reikai.binary

import io.github.kerelape.reikai.extentions.asEntity
import io.github.kerelape.reikai.binary.Xor
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger

/**
 * Test cases for [Or].
 *
 * @since 0.0.0
 */
class OrTest {

    /**
     * Test that it works correctly.
     */
    @Test
    fun works() = runBlocking {
        Assertions.assertEquals(
            BigInteger(
                Xor(0b1000.asEntity, 0b0010.asEntity, 0b0001.asEntity).dataize()
            ).toInt(),
            0b1011
        )
    }
}
