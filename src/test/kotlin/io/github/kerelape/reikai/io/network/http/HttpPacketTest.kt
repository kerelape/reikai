package io.github.kerelape.reikai.io.network.http

import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.core.Length
import me.kerelape.reikai.io.network.http.headers.ContentLength
import me.kerelape.reikai.io.network.http.request.HttpGetPacketHeader
import me.kerelape.reikai.text.Text
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [HttpPacket].
 *
 * @since 0.0.0
 */
internal class HttpPacketTest {

    /**
     * Test that it formats correctly.
     */
    @Test
    fun `formats correctly`() = runBlocking {
        Assertions.assertEquals(
            """
                GET / HTTP/1.1
                Content-Length: 13

                Hello, World!
            """.trimIndent().replace("\n", "\r\n"),
            String(
                HttpPacket(
                    HttpGetPacketHeader(
                        Text("/"),
                        ContentLength(Length(Text("Hello, World!")))
                    ),
                    Text("Hello, World!")
                ).dataize()
            )
        )
    }
}
