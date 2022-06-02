package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Form factors type of the [memory][Memory].
 */
@Suppress("SpellCheckingInspection")
@Serializable
public sealed interface MemoryFormFactor {
    /** Dual In-line Memory Module */
    @Serializable
    public data class DIMM(public val pinCount: UInt) : MemoryFormFactor

    /**
     * Small Outline [DIMM] (Dual In-line Memory Module)
     */
    @Serializable
    public data class SmallOutlineDIMM(public val pinCount: UInt) : MemoryFormFactor
}
