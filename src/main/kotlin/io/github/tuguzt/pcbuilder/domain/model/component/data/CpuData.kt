package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.ThermalDesignPower
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.cpu.*
import io.github.tuguzt.pcbuilder.domain.model.component.memory.MemoryECCType
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("cpu")
public data class CpuData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: ManufacturerData,
    override val imageUri: String?,
    override val isFavorite: Boolean,
    override val coreCount: CpuCoreCount,
    override val threadCount: CpuThreadCount,
    override val coreClockRate: CpuClockRate,
    override val boostClockRate: CpuClockRate,
    override val thermalDesignPower: ThermalDesignPower,
    override val integratedGraphics: CpuIntegratedGraphics?,
    override val smt: CpuSMT,
    override val socket: CpuSocket,
    override val series: CpuSeries,
    override val memoryECCType: MemoryECCType,
) : PolymorphicComponent(), CentralProcessingUnit
