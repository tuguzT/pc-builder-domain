package io.github.tuguzt.pcbuilder.domain.model.units

import io.github.tuguzt.pcbuilder.domain.model.units.Electricity.Companion.ampere
import io.nacular.measured.units.UnitsRatio
import io.nacular.measured.units.div

/**
 * Represents quantity of voltage.
 */
public typealias Voltage = UnitsRatio<Power, Electricity>

public val volt: Voltage = watt / ampere
