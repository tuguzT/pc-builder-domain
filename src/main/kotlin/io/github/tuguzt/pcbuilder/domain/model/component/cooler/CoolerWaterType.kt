package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import kotlinx.serialization.Serializable

/**
 * Water cooling type of the [cooler][Cooler]
 * with [radiator size][radiatorSize] in millimeters.
 */
@Serializable
public enum class CoolerWaterType(public val radiatorSize: UShort) {
    W120mm(radiatorSize = 120u),
    W140mm(radiatorSize = 140u),
    W240mm(radiatorSize = 240u),
    W280mm(radiatorSize = 280u),
    W360mm(radiatorSize = 360u),
    W420mm(radiatorSize = 420u),
}
