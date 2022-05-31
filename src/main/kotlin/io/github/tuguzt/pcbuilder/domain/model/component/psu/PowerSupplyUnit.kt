package io.github.tuguzt.pcbuilder.domain.model.component.psu

import io.github.tuguzt.pcbuilder.domain.model.component.Component

/**
 * Interface for all power supply units (or [PSU]) of PC.
 */
public interface PowerSupplyUnit : Component {
    public val efficiencyRating: PowerSupplyUnitEfficiencyRating
    public val modularity: PowerSupplyUnitModularity?
    public val wattage: PowerSupplyUnitWattage
    public val type: PowerSupplyUnitType
    public val fanType: PowerSupplyUnitFanType
    public val connectors: PowerSupplyUnitConnectors
}

/**
 * Shorthand for [power supply unit][PowerSupplyUnit].
 */
public typealias PSU = PowerSupplyUnit
