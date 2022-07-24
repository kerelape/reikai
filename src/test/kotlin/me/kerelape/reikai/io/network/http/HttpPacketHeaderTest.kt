package me.kerelape.reikai.io.network.http

import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.text.Text
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [HttpPacketHeader].
 *
 * @since 0.0.0
 */
internal class HttpPacketHeaderTest {

    /**
     * Test that it formats correctly.
     */
    @Test
    fun `formats correctly`() = runBlocking {
        Assertions.assertEquals(
            "type\r\nheaders",
            String(
                HttpPacketHeader(
                    Text("type"),
                    Text("headers")
                ).dataize()
            )
        )
    }
}
