package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.nacular.measured.units.Mass
import io.nacular.measured.units.Measure

/**
 * Base interface for all PC components.
 */
public interface Component : Identifiable<String> {
    public val name: String
    public val description: String
    public val weight: Measure<Mass>
    public val size: Size
}
