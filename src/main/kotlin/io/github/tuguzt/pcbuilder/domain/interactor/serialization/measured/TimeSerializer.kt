package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.Time

public object TimeSerializer : UnitsBaseSerializer<Time>("time") {
    override val factory: (String, Double) -> Time = ::Time
}
