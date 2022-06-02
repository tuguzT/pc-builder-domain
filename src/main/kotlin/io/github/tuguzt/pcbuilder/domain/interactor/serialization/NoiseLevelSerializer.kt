package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.UnitsBaseSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.NoiseLevel

/**
 * Serializer class for units of [noise level][NoiseLevel].
 */
public object NoiseLevelSerializer : UnitsBaseSerializer<NoiseLevel>("noise_level") {
    override val factory: (String, Double) -> NoiseLevel = ::NoiseLevel
}
