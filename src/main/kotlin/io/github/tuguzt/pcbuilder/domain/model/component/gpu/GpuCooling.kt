package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.Serializable

/**
 * Cooling of the [graphics processing unit][GraphicsProcessingUnit].
 */
@Serializable
public data class GpuCooling(
    public val fanCount: UByte,
    public val radiator: Radiator?,
) {
    /**
     * Radiator variants of the [GPU cooling][GpuCooling].
     */
    @Serializable
    public enum class Radiator(public val size: UShort) {
        R120(size = 120u),
        R240(size = 240u),
        R360(size = 360u),
    }
}
