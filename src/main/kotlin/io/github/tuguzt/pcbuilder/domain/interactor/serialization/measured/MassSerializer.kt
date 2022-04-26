package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.Mass

public object MassSerializer : UnitsBaseSerializer<Mass>("mass") {
    override val factory: (String, Double) -> Mass = ::Mass
}
