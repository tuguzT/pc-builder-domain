package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Timing of [memory][Memory].
 */
@Serializable
public data class MemoryTiming(val casLatency: UInt, val tRCD: UInt, val tRP: UInt, val tRAS: UInt) {
    override fun toString(): String = "$casLatency-$tRCD-$tRP-$tRAS"
}
