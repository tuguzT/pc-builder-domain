package io.github.tuguzt.pcbuilder.domain.model.component.cases.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.cases.*
import io.github.tuguzt.pcbuilder.domain.model.component.data.ManufacturerData
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.MotherboardFormFactor
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class CaseData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Weight,
    override val size: Size,
    override val manufacturer: ManufacturerData,
    override val driveBays: CaseDriveBays,
    override val expansionSlots: CaseExpansionSlots,
    override val motherboardFormFactors: List<MotherboardFormFactor>,
    override val powerSupply: CasePowerSupply?,
    override val powerSupplyShroud: CasePowerSupplyShroud,
    override val sidePanelWindow: CaseSidePanelWindow?,
    override val type: CaseType,
) : Case
