package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * 80 Plus certification rating of the [power supply unit][PowerSupplyUnit].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class PsuEfficiencyRating {
    R80_Plus_Titanium,
    R80_Plus_Platinum,
    R80_Plus_Gold,
    R80_Plus_Silver,
    R80_Plus_Bronze,
    R80_Plus,
}
