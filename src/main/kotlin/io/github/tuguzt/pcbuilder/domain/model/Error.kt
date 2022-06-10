package io.github.tuguzt.pcbuilder.domain.model

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

/**
 * Simple error type with [message] and [timestamp][at].
 */
@Serializable
public data class Error(
    public val message: String,
    public val at: Instant,
)
