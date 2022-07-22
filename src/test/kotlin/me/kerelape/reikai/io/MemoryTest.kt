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
class MemoryTest {

    /**
     * Test that it puts data correctly.
     */
    @Test
    fun `puts data`() = runBlocking {
        val heap = Memory(
            Heap(ByteBuffer.allocate(Long.SIZE_BYTES * 2)),
            3.asEntity,
            Long.SIZE_BYTES.asEntity
        )
        Assertions.assertEquals(
            BigInteger(heap.put(128.asEntity).dataize()).toLong(),
            BigInteger(heap.dataize()).toLong()
        )
    }
}
