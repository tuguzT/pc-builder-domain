package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.ThermalDesignPower
import io.github.tuguzt.pcbuilder.domain.model.component.memory.MemoryECCType

/**
 * Interface for all central processing units (or [CPU]) of PC.
 */
public interface CentralProcessingUnit : Component {
    public val coreCount: CpuCoreCount
    public val threadCount: CpuThreadCount
    public val coreClockRate: CpuClockRate
    public val boostClockRate: CpuClockRate
    public val thermalDesignPower: ThermalDesignPower
    public val integratedGraphics: CpuIntegratedGraphics?
    public val smt: CpuSMT
    public val socket: CpuSocket
    public val series: CpuSeries
    public val memoryECCType: MemoryECCType
}

/**
 * Shorthand for [central processing unit][CentralProcessingUnit].
 */
public typealias CPU = CentralProcessingUnit
