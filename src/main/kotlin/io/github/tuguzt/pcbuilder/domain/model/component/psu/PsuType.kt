package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * Type of the [power supply unit][PowerSupplyUnit].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class PsuType {
    ATX,
    BTX,
    ATX12V,
    EPS12V,
    Flex_ATX,
    Micro_ATX,
    Mini_ITX,
    SFX12V,
    TFX12V;

    override fun toString(): String = name.replace('_', ' ')
}
