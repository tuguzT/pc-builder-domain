package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.Serializable

/**
 * Memory type of the [graphics processing unit][GraphicsProcessingUnit].
 */
@Suppress("SpellCheckingInspection")
@Serializable
public enum class GpuMemoryType {
    DDR,
    DDR2,
    DDR3,
    DDR4,
    GDDR2,
    GDDR3,
    GDDR5,
    GDDR5X,
    GDDR6,
    GDDR6X,
    HBM,
    HBM2,
}
