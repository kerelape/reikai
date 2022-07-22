package me.kerelape.reikai.io.network

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import me.kerelape.reikai.core.Entity
import me.kerelape.reikai.extentions.asEntity
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
        val endpoint = TcpEndpoint(
            "localhost".asEntity,
            8080.asEntity
        )
        val server = endpoint.listen()
        launch {
            val connection = server.open()
            connection.put(connection)
        }
        val client = endpoint.open()
        /*
            @todo #9 We need to have a wrapper for ByteArray and replace this anonymous object with it
         */
        client.put(object : Entity {
            override suspend fun dataize(): ByteArray {
                return byteArrayOf(32)
            }
        })
        Assertions.assertEquals(
            32.toByte(),
            client.dataize()[0]
        )
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
