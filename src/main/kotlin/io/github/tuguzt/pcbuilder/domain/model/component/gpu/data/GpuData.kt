package io.github.tuguzt.pcbuilder.domain.model.component.gpu.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Manufacturer
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.ThermalDesignPower
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.*
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class GpuData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: Manufacturer,
    override val `interface`: GpuInterface,
    override val chipset: GpuChipset,
    override val coreClockRate: GpuClockRate,
    override val boostClockRate: GpuClockRate,
    override val memoryType: GpuMemoryType,
    override val memoryCapacity: GpuMemoryCapacity,
    override val multiSupport: GpuMultiSupport?,
    override val frameSyncType: GpuFrameSyncType?,
    override val thermalDesignPower: ThermalDesignPower,
    override val ports: GpuPorts,
    override val expansionSlotWidth: UByte,
    override val cooling: GpuCooling,
    override val externalPower: GpuExternalPower,
) : GraphicsProcessingUnit
