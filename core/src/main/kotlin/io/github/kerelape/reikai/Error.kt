package io.github.kerelape.reikai

/**
 * Error.
 *
 * @throws DataizationException with the message.
 * @since 0.2.0
 */
class Error(message: Entity = Empty) : EntityWrap(
    Entity {
        throw DataizationException(String(message.dataize()))
    }
)
