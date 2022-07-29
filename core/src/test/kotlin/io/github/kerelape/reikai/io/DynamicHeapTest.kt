package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.logic.Identity
import io.github.kerelape.reikai.logic.toBoolean
import io.github.kerelape.reikai.math.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [DynamicHeap].
 *
 * @since 0.2.0
 */
internal class DynamicHeapTest {
    /**
     * Test that it puts data after its size.
     */
    @Test
    fun `append data after actual size`() = runBlocking {
        val heap = DynamicHeap()
        heap.put(0.asEntity, Data(byteArrayOf(5, 5, 5)))
        heap.put(10.asEntity, Data(byteArrayOf(1, 1, 1)))
        Assertions.assertTrue(
            Identity(
                heap,
                Data(byteArrayOf(5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1))
            ).toBoolean()
        )
    }
}
