package io.github.kerelape.reikai.io.network.http.request

import io.github.kerelape.reikai.io.network.http.headers.HttpHeader
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [HttpGetPacketHeader].
 *
 * @since 0.0.0
 */
internal class HttpGetPacketHeaderTest {

    /**
     * Test that it formats correctly.
     */
    @Test
    fun `formats correctly`() = runBlocking {
        Assertions.assertEquals(
            """
                GET / HTTP/1.1
                Sample-Header: sample-content
            """.trimIndent().replace("\n", "\r\n"),
            String(
                HttpGetPacketHeader(
                    Text("/"),
                    HttpHeader(Text("Sample-Header"), Text("sample-content"))
                ).dataize()
            )
        )
    }
}
