package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import io.github.tuguzt.pcbuilder.domain.model.component.Component

/**
 * Interface for all central processing units (or [CPU]) of PC.
 */
public interface CentralProcessingUnit : Component {
    public val manufacturer: CpuManufacturer
    public val coreCount: CpuCoreCount
    public val coreClockRate: CpuClockRate
    public val boostClockRate: CpuClockRate
    public val thermalDesignPower: CpuThermalDesignPower
    public val integratedGraphics: CpuIntegratedGraphics?
    public val smt: CpuSMT
    public val socket: CpuSocket
    public val eccType: CpuECCType
}

/**
 * Shorthand for [central processing unit][CentralProcessingUnit].
 */
public typealias CPU = CentralProcessingUnit
