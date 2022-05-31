package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.Serializable

/**
 * Ports of the [graphics processing unit][GraphicsProcessingUnit].
 */
@Serializable
public data class GpuPorts(
    public val dviCount: UByte,
    public val hdmiCount: UByte,
    public val miniHdmiCount: UByte,
    public val displayPortCount: UByte,
    public val miniDisplayPortCount: UByte,
)
