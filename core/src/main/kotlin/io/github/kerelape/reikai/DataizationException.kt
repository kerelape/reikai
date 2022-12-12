package io.github.kerelape.reikai

/**
 * Dataization exception. Thrown when an entity could not be dataized for a reason.
 *
 * @since 0.2.0
 */
class DataizationException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
