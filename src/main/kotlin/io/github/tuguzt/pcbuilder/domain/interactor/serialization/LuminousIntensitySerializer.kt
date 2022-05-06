package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.UnitsBaseSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.LuminousIntensity

/**
 * Serializer class for units of [luminous intensity][LuminousIntensity].
 */
public object LuminousIntensitySerializer : UnitsBaseSerializer<LuminousIntensity>("luminous_intensity") {
    override val factory: (String, Double) -> LuminousIntensity = ::LuminousIntensity
}
