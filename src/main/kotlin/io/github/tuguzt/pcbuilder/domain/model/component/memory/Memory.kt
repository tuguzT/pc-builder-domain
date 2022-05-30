package io.github.tuguzt.pcbuilder.domain.model.component.memory

import io.github.tuguzt.pcbuilder.domain.model.component.Component

/**
 * Interface for all memory (`RAM` stands for `Random Access Memory`) of PC.
 */
public interface Memory : Component {
    public val formFactor: MemoryFormFactor
    public val type: MemoryType
    public val speed: MemorySpeed
    public val modules: MemoryModules
    public val voltage: MemoryVoltage
    public val timing: MemoryTiming
    public val registerType: MemoryRegisterType
    public val eccType: MemoryECCType
}
