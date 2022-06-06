package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GpuChipset
import kotlinx.serialization.Serializable

@Serializable
public data class GpuChipsetData(override val name: String) : GpuChipset
