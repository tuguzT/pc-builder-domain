package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.ThermalDesignPower

/**
 * Interface for all graphics processing units (or [GPU]) of PC.
 */
public interface GraphicsProcessingUnit : Component {
    public val `interface`: GpuInterface
    public val chipset: GpuChipset
    public val coreClockRate: GpuClockRate
    public val boostClockRate: GpuClockRate
    public val memoryType: GpuMemoryType
    public val memoryCapacity: GpuMemoryCapacity
    public val multiSupport: GpuMultiSupport?
    public val frameSyncType: GpuFrameSyncType?
    public val thermalDesignPower: ThermalDesignPower
    public val ports: GpuPorts
    public val expansionSlotWidth: UByte
    public val cooling: GpuCooling
    public val externalPower: GpuExternalPower
}

/**
 * Shorthand for [graphics processing unit][GraphicsProcessingUnit].
 */
public typealias GPU = GraphicsProcessingUnit
