package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.memory.MemoryECCType
import io.github.tuguzt.pcbuilder.domain.model.component.memory.MemoryType

/**
 * Interface for all motherboards of PC.
 */
public interface Motherboard : Component {
    public val formFactor: MotherboardFormFactor
    public val chipset: MotherboardChipset
    public val cpuSocket: MotherboardCpuSocket
    public val memoryType: MemoryType
    public val memoryECCType: MemoryECCType
    public val memoryAmount: MotherboardMemoryAmount
    public val memorySlotCount: MotherboardMemorySlotCount
    public val multiGpuSupport: MotherboardMultiGpuSupport?
    public val slots: MotherboardSlots
    public val ports: MotherboardPorts
    public val usbHeaders: MotherboardUsbHeaders
}
