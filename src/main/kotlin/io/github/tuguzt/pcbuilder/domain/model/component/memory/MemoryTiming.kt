package io.github.tuguzt.pcbuilder.domain.model.component.memory

/**
 * Data class represents timing of memory.
 *
 * @see Memory
 */
public data class MemoryTiming(val casLatency: UInt, val tRCD: UInt, val tRP: UInt, val tRAS: UInt) {
    override fun toString(): String = "$casLatency-$tRCD-$tRP-$tRAS"
}
