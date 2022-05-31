package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * Type of the [power supply unit][PowerSupplyUnit].
 */
@Serializable
public enum class PowerSupplyUnitType {
    ATX,
    BTX,
    ATX12V,
    EPS12V,
    FlexATX,
    MicroATX,
    MiniITX,
    SFX12V,
    TFX12V,
}
