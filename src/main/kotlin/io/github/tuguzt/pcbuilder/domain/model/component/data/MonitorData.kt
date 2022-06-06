package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Manufacturer
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GpuFrameSyncType
import io.github.tuguzt.pcbuilder.domain.model.component.monitor.*
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("monitor")
public data class MonitorData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: Manufacturer,
    override val imageUri: String?,
    override val isFavorite: Boolean,
    override val aspectRatio: MonitorAspectRatio,
    override val contrastRatio: MonitorContrastRatio,
    override val refreshRate: MonitorRefreshRate,
    override val responseTime: MonitorResponseTime,
    override val frameSyncType: GpuFrameSyncType?,
    override val interfaces: Map<MonitorInterface, UInt>,
    override val panelType: MonitorPanelType,
    override val pwmType: MonitorPWMType,
    override val resolution: MonitorResolution,
    override val screenType: MonitorScreenType,
) : PolymorphicComponent(), Monitor
