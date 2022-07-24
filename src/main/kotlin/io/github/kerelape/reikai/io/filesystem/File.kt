package io.github.kerelape.reikai.io.filesystem

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import io.github.kerelape.reikai.core.Entity
import me.kerelape.reikai.io.RandomAccessChannel
import me.kerelape.reikai.io.RandomAccessSource
import me.kerelape.reikai.logic.False
import java.nio.channels.AsynchronousFileChannel
import java.nio.file.OpenOption
import java.nio.file.Path

/**
 * File.
 *
 * @since 0.0.0
 */
class File(private val path: io.github.kerelape.reikai.core.Entity, private vararg val options: OpenOption) : RandomAccessSource {

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
    override suspend fun close(): io.github.kerelape.reikai.core.Entity {
        return False
    }
}
