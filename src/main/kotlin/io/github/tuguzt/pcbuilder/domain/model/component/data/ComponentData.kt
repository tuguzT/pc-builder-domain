package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of [component][Component].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ComponentData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: ManufacturerData,
) : Component
