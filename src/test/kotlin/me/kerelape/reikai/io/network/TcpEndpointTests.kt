package me.kerelape.reikai.io.network

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.core.Quantum
import me.kerelape.reikai.extentions.asQuantum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.math.BigInteger

/**
 * Test cases for [TcpEndpoint].
 *
 * @since 0.0.0
 */
class TcpEndpointTests {

    /**
     * Test that the endpoint works.
     */
    @Disabled
    @Test
    fun `test works`(): Unit = runBlocking {
        val endpoint = TcpEndpoint(
            /*
                @todo Create adapter for kotlin.String and replace this object with it
             */
            (object : Quantum {
                override suspend fun data(): ByteArray {
                    return "localhost".toByteArray()
                }
            }),
            8080.asQuantum
        )
        val server = endpoint.listen()
        launch {
            val connection = server.open()
            connection.put(connection)
            connection.close()
        }
        val client = endpoint.open()
        client.put(128.asQuantum)
        Assertions.assertEquals(
            128L,
            BigInteger(client.data()).toLong()
        )
    }

    @Test
    fun `dataizes to address`() = runBlocking {
        Assertions.assertEquals(
            "localhost:8080",
            String(
                TcpEndpoint(
                    (object : Quantum {
                        override suspend fun data(): ByteArray {
                            return "localhost".toByteArray()
                        }
                    }),
                    8080.asQuantum
                ).data()
            )
        )
    }
}
