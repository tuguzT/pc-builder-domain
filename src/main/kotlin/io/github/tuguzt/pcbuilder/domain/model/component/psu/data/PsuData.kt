package io.github.tuguzt.pcbuilder.domain.model.component.psu.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Manufacturer
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.psu.*
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class PsuData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: Manufacturer,
    override val efficiencyRating: PsuEfficiencyRating?,
    override val modularity: PsuModularity?,
    override val wattage: PsuWattage,
    override val type: PsuType,
    override val fanType: PsuFanType,
    override val connectors: PsuConnectors,
) : PowerSupplyUnit
