package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.memory.*
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("memory")
public data class MemoryData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: ManufacturerData,
    override val imageUri: String?,
    override val isFavorite: Boolean,
    override val formFactor: MemoryFormFactor,
    override val memoryType: MemoryType,
    override val speed: MemorySpeed,
    override val modules: MemoryModules,
    override val voltage: MemoryVoltage,
    override val timing: MemoryTiming,
    override val registerType: MemoryRegisterType,
    override val eccType: MemoryECCType,
) : PolymorphicComponent(), Memory
