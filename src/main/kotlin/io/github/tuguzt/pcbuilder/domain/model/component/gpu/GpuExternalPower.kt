package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.Serializable

/**
 * External power of the [graphics processing unit][GraphicsProcessingUnit].
 */
@Serializable
public data class GpuExternalPower(
    public val pciExpress6pinCount: UByte,
    public val pciExpress8pinCount: UByte,
    public val pciExpress12pinCount: UByte,
    public val pciExpress16pinCount: UByte,
)
