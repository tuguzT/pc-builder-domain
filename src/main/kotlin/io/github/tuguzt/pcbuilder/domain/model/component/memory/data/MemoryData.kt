package io.github.tuguzt.pcbuilder.domain.model.component.memory.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Manufacturer
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.memory.*
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class MemoryData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: Manufacturer,
    override val formFactor: MemoryFormFactor,
    override val type: MemoryType,
    override val speed: MemorySpeed,
    override val modules: MemoryModules,
    override val voltage: MemoryVoltage,
    override val timing: MemoryTiming,
    override val registerType: MemoryRegisterType,
    override val eccType: MemoryECCType,
) : Memory
