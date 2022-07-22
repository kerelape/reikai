package me.kerelape.reikai.io

import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.extentions.asEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigInteger
import java.nio.ByteBuffer

/**
 * Test cases for [Heap].
 *
 * @since 0.0.0
 */
class HeapTest {

    /**
     * Test that it puts data correctly.
     */
    @Test
    fun `puts data`() = runBlocking {
        val heap = Heap(ByteBuffer.allocate(Long.SIZE_BYTES))
        Assertions.assertEquals(
            BigInteger(heap.put(0.asEntity, 128.asEntity).dataize()).toLong(),
            BigInteger(heap.dataize()).toLong()
        )
    }
}
