package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * 80 Plus certification rating of the [power supply unit][PowerSupplyUnit].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class PsuEfficiencyRating {
    R80Plus_Titanium,
    R80Plus_Platinum,
    R80Plus_Gold,
    R80Plus_Silver,
    R80Plus_Bronze,
    R80Plus;

    override fun toString(): String = name.substring(1).replace("Plus", "+").replace('_', ' ')
}
