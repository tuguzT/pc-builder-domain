package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import kotlinx.serialization.Serializable

/**
 * Bearing type of the [cooler][Cooler].
 */
@Serializable
public enum class CoolerBearing {
    Ball,
    FluidDynamic,
    Rifle,
    Sleeve,
}
