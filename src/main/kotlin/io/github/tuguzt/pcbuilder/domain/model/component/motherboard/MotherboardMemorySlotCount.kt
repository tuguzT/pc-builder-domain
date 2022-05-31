package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * Memory slot count of the [motherboard][Motherboard].
 */
@JvmInline
@Serializable
public value class MotherboardMemorySlotCount(internal val count: UInt) {
    init {
        require(count > 0u) { "Memory slot count must be greater than zero" }
    }
}

/**
 * Converts [memory slot count][MotherboardMemorySlotCount] to [UInt].
 */
public fun MotherboardMemorySlotCount.toUInt(): UInt = count
