package io.github.kerelape.reikai.io.filesystem

import io.github.kerelape.reikai.math.asEntity
import kotlinx.coroutines.runBlocking
import io.github.kerelape.reikai.io.Memory
import io.github.kerelape.reikai.text.Text
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Path
import java.nio.file.StandardOpenOption

/**
 * Test cases for [File].
 *
 * @since 0.0.0
 */
class FileTest {

    /**
     * Test that the file can write and then read.
     */
    @Test
    fun `can write`(@TempDir dir: Path): Unit = runBlocking {
        val memory = Memory(
            File(
                Text(dir.resolve("test.txt").toString()),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE_NEW,
                StandardOpenOption.DELETE_ON_CLOSE
            ).open(),
            0.asEntity,
            13.asEntity
        )
        Assertions.assertEquals(
            String(memory.put(Text("Hello, World!")).dataize()),
            String(memory.dataize())
        )
    }
}
