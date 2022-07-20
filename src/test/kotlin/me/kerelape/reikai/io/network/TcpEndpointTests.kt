package me.kerelape.reikai.io.network

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.extentions.asEntity
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
                @todo #2 Create adapter for kotlin.String and replace this object with it
             */
            (object : Entity {
                override suspend fun dataize(): ByteArray {
                    return "localhost".toByteArray()
                }
            }),
            8080.asEntity
        )
        val server = endpoint.listen()
        launch {
            val connection = server.open()
            connection.put(connection)
            connection.close()
        }
        val client = endpoint.open()
        client.put(128.asEntity)
        Assertions.assertEquals(
            128L,
            BigInteger(client.dataize()).toLong()
        )
    }

    @Test
    fun `dataizes to address`() = runBlocking {
        Assertions.assertEquals(
            "localhost:8080",
            String(
                TcpEndpoint(
                    (object : Entity {
                        override suspend fun dataize(): ByteArray {
                            return "localhost".toByteArray()
                        }
                    }),
                    8080.asEntity
                ).dataize()
            )
        )
    }
}
