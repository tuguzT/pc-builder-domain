package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Timing of [memory][Memory].
 */
@Serializable
public data class MemoryTiming(val casLatency: UInt, val tRCD: UInt, val tRP: UInt, val tRAS: UInt) {
    override fun toString(): String = "$casLatency-$tRCD-$tRP-$tRAS"
}

/**
 * Converts string to memory timing.
 *
 * @see MemoryTiming.toString
 */
public fun String.toMemoryTiming(): MemoryTiming {
    val data = split('-').take(4).map { it.toUInt() }
    return MemoryTiming(data[0], data[1], data[2], data[3])
}
