package io.github.kerelape.reikai.typing

/**
 * Describes type of data.
 *
 * @since 0.1.0
 */
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.VALUE_PARAMETER,
)
annotation class Strict(val type: Type)
