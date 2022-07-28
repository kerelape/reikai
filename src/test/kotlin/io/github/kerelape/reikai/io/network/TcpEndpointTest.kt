package io.github.kerelape.reikai.io.network

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import io.github.kerelape.reikai.core.Data
import io.github.kerelape.reikai.math.asEntity
import io.github.kerelape.reikai.text.asEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Test cases for [TcpEndpoint].
 *
 * @since 0.0.0
 */
class TcpEndpointTest {

    /**
     * Test that the endpoint works.
     */
    @Test
    fun `test works`(): Unit = runBlocking {
        val endpoint = TcpEndpoint("localhost".asEntity, 8080.asEntity)
        val server = endpoint.listen()
        launch {
            val connection = server.open()
            connection.put(connection)
        }
        val client = endpoint.open()
        client.put(Data(byteArrayOf(32)))
        Assertions.assertEquals(32.toByte(), client.dataize()[0])
        server.close()
    }

    @Test
    fun `dataizes to address`() = runBlocking {
        Assertions.assertEquals(
            "localhost:8080",
            String(
                TcpEndpoint(
                    "localhost".asEntity,
                    8080.asEntity
                ).dataize()
            )
        )
    }

    @Test
    fun `close returns false`() = runBlocking {
        Assertions.assertEquals(
            0,
            TcpEndpoint(0.asEntity, 0.asEntity).close().dataize()[0]
        )
    }
}
