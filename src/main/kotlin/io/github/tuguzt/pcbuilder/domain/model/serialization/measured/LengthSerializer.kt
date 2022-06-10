package io.github.tuguzt.pcbuilder.domain.model.serialization.measured

import io.nacular.measured.units.Length

/**
 * Serializer class for units of [length][Length].
 */
public object LengthSerializer : UnitsBaseSerializer<Length>("length") {
    override val factory: (String, Double) -> Length = ::Length
}
