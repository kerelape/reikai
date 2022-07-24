package io.github.kerelape.reikai.logic

import io.github.kerelape.reikai.extentions.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger

/**
 * Test cases for [Xor].
 *
 * @since 0.0.0
 */
class XorTest {

    /**
     * Test that it works correctly.
     */
    @Test
    fun works() = runBlocking {
        Assertions.assertEquals(
            BigInteger(
                Xor(30.asEntity, 21.asEntity, 9.asEntity).dataize()
            ).toInt(),
            30.xor(21).xor(9)
        )
    }
}
