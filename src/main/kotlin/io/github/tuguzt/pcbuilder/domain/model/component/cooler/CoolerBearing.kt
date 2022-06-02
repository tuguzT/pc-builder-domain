package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import kotlinx.serialization.Serializable

/**
 * Bearing type of the [cooler][Cooler].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class CoolerBearing {
    Ball,
    Fluid_Dynamic,
    Rifle,
    Sleeve;

    override fun toString(): String = name.replace('_', ' ')
}
