package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Represents all possible types of [memory][Memory].
 */
@Serializable
public enum class MemoryType {
    /** Synchronous DRAM (Dynamic RAM) */
    SDRAM,

    /** Rambus DRAM (Dynamic RAM) */
    RDRAM,

    /**
     * Double Data Rate [SDRAM]
     */
    DDR,

    /**
     * Second generation of the [DDR].
     */
    DDR2,

    /**
     * Third generation of the [DDR].
     */
    DDR3,

    /**
     * Fourth generation of the [DDR].
     */
    DDR4,

    /**
     * Fifth generation of the [DDR].
     */
    DDR5,
}
