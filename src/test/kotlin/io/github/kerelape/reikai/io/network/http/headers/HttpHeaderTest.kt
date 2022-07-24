package io.github.kerelape.reikai.io.network.http.headers

import io.github.kerelape.reikai.text.Text
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [HttpHeader].
 *
 * @since 0.0.0
 */
internal class HttpHeaderTest {

    /**
     * Test that it formats correctly.
     */
    @Test
    fun `formats correctly`() = runBlocking {
        Assertions.assertEquals(
            "Header-Name: header-value",
            String(
                HttpHeader(
                    Text("Header-Name"),
                    Text("header-value")
                ).dataize()
            )
        )
    }
}
