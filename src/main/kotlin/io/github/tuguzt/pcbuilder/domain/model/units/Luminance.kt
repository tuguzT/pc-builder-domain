package io.github.tuguzt.pcbuilder.domain.model.units

import io.github.tuguzt.pcbuilder.domain.model.units.LuminousIntensity.Companion.candela
import io.nacular.measured.units.*
import io.nacular.measured.units.Length.Companion.meters

/**
 * Represents quantity of luminance.
 */
public typealias Luminance = UnitsRatio<LuminousIntensity, Square<Distance>>

public val nit: Luminance = candela / (meters * meters)
