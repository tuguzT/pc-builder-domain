package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.UnitsBaseSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Electricity

/**
 * Serializer class for units of [electricity][Electricity].
 */
public object ElectricitySerializer : UnitsBaseSerializer<Electricity>("electricity") {
    override val factory: (String, Double) -> Electricity = ::Electricity
}
