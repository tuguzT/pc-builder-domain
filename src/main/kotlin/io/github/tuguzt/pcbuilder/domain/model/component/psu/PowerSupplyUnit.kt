package io.github.tuguzt.pcbuilder.domain.model.component.psu

import io.github.tuguzt.pcbuilder.domain.model.component.Component

/**
 * Interface for all power supply units (or [PSU]) of PC.
 */
public interface PowerSupplyUnit : Component {
    public val efficiencyRating: PsuEfficiencyRating?
    public val modularity: PsuModularity?
    public val wattage: PsuWattage
    public val type: PsuType
    public val fanType: PsuFanType
    public val connectors: PsuConnectors
}

/**
 * Shorthand for [power supply unit][PowerSupplyUnit].
 */
public typealias PSU = PowerSupplyUnit
