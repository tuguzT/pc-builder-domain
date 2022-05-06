package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.Angle

/**
 * Serializer class for units of [angle][Angle].
 */
public object AngleSerializer : UnitsBaseSerializer<Angle>("angle") {
    override val factory: (String, Double) -> Angle = ::Angle
}
