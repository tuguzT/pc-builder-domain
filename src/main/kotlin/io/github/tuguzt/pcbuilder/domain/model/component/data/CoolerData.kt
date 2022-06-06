package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.cooler.*
import io.github.tuguzt.pcbuilder.domain.model.component.cpu.CpuSocket
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("cooler")
public data class CoolerData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: ManufacturerData,
    override val imageUri: String?,
    override val isFavorite: Boolean,
    override val bearing: CoolerBearing,
    override val cpuSocket: List<CpuSocket>,
    override val waterType: CoolerWaterType?,
    override val fanType: CoolerFanType,
    override val fanRPM: CoolerRPM?,
    override val noiseLevel: CoolerNoiseLevel,
) : PolymorphicComponent(), Cooler
