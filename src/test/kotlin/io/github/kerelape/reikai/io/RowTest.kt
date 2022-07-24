package io.github.kerelape.reikai.io

import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [Row].
 *
 * @since 0.0.0
 */
internal class RowTest {

    /**
     * Test that it appends.
     */
    @Test
    fun appends() = runBlocking {
        val row = Row()
        row.put(Text("a"))
        row.put(Text("b"))
        row.put(Text("c"))
        Assertions.assertEquals(
            "abc",
            String(row.dataize())
        )
    }
}