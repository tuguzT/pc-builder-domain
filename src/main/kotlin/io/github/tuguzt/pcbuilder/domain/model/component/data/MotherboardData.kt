package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GpuMultiSupport
import io.github.tuguzt.pcbuilder.domain.model.component.memory.MemoryECCType
import io.github.tuguzt.pcbuilder.domain.model.component.memory.MemoryType
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.*
import io.github.tuguzt.pcbuilder.domain.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("motherboard")
public data class MotherboardData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: ManufacturerData,
    override val imageUri: String?,
    override val isFavorite: Boolean,
    override val formFactor: MotherboardFormFactor,
    override val chipset: MotherboardChipset,
    override val cpuSocket: MotherboardCpuSocket,
    override val memoryType: MemoryType,
    override val memoryECCType: MemoryECCType,
    override val memoryAmount: MotherboardMemoryAmount,
    override val memorySlotCount: MotherboardMemorySlotCount,
    override val multiGpuSupport: GpuMultiSupport?,
    override val slots: MotherboardSlots,
    override val ports: MotherboardPorts,
    override val usbHeaders: MotherboardUsbHeaders,
) : PolymorphicComponent(), Motherboard
