package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.Length

public object LengthSerializer : UnitsBaseSerializer<Length>("length") {
    override val factory: (String, Double) -> Length = ::Length
}
