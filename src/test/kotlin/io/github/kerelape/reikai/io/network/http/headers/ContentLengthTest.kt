package io.github.kerelape.reikai.io.network.http.headers

import io.github.kerelape.reikai.math.asEntity
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [ContentLength].
 *
 * @since 0.0.0
 */
internal class ContentLengthTest {

    /**
     * Test that it formats correctly.
     */
    @Test
    fun `formats correctly`() = runBlocking {
        Assertions.assertEquals(
            "Content-Length: 128",
            String(ContentLength(128.asEntity).dataize())
        )
    }
}
