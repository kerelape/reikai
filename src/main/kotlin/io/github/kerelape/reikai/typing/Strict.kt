package io.github.kerelape.reikai.typing

/**
 * Describes type of data.
 *
 * @todo #71 Create a ktlint check. This check will throw a warning if types differ.
 * @since 0.1.0
 */
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.VALUE_PARAMETER
)
annotation class Strict(val type: Type)
