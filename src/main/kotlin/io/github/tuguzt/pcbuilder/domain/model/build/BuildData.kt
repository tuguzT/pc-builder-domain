package io.github.tuguzt.pcbuilder.domain.model.build

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.*
import io.github.tuguzt.pcbuilder.domain.model.user.data.UserData
import io.github.tuguzt.pcbuilder.domain.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class BuildData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val user: UserData,
    override val case: CaseData?,
    override val cooler: CoolerData?,
    override val centralProcessingUnit: CpuData?,
    override val graphicsProcessingUnit: List<GpuData>,
    override val memory: List<MemoryData>,
    override val monitor: List<MonitorData>,
    override val motherboard: MotherboardData?,
    override val powerSupplyUnit: PsuData?,
    override val storage: List<StorageData>,
) : Build
