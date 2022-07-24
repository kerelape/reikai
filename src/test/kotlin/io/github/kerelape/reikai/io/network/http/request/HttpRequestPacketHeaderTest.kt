package io.github.kerelape.reikai.io.network.http.request

import io.github.kerelape.reikai.io.network.http.headers.HttpHeader
import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [HttpRequestPacketHeader].
 *
 * @since 0.0.0
 */
internal class HttpRequestPacketHeaderTest {

    /**
     * Test that it formats correctly.
     */
    @Test
    fun `formats correctly`() = runBlocking {
        Assertions.assertEquals(
            """
                GET / HTTP/1.1
                Header: first-header
                Accept: application/json
            """.trimIndent().replace("\n", "\r\n"),
            String(
                HttpRequestPacketHeader(
                    Text("GET"),
                    Text("/"),
                    HttpHeader(
                        Text("Header"),
                        Text("first-header")
                    ),
                    HttpHeader(
                        Text("Accept"),
                        Text("application/json")
                    )
                ).dataize()
            )
        )
    }
}