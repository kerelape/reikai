package io.github.kerelape.reikai.io.filesystem

import io.github.kerelape.reikai.core.Entity
import io.github.kerelape.reikai.io.RandomAccessChannel
import io.github.kerelape.reikai.io.RandomAccessSource
import io.github.kerelape.reikai.logic.False
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.nio.channels.AsynchronousFileChannel
import java.nio.file.OpenOption
import java.nio.file.Path

/**
 * File.
 *
 * @since 0.0.0
 */
class File(private val path: Entity, private vararg val options: OpenOption) : RandomAccessSource {

    /**
     * @return Path to the file.
     */
    override suspend fun dataize(): ByteArray {
        return this.path.dataize()
    }

    override suspend fun open(): RandomAccessChannel {
        val path = Path.of(String(this.path.dataize()))
        val channel = withContext(Dispatchers.IO) {
            AsynchronousFileChannel.open(path, *options)
        }
        return RandomAccessFileChannel(channel, this)
    }

    /**
     * Does nothing.
     *
     * @return [False].
     */
    override suspend fun close(): Entity {
        return False
    }
}
