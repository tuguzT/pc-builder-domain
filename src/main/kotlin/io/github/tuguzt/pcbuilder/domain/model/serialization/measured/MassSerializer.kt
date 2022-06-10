package io.github.tuguzt.pcbuilder.domain.model.serialization.measured

import io.nacular.measured.units.Mass

/**
 * Serializer class for units of [mass][Mass].
 */
public object MassSerializer : UnitsBaseSerializer<Mass>("mass") {
    override val factory: (String, Double) -> Mass = ::Mass
}
