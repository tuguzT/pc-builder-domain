package io.github.tuguzt.pcbuilder.domain.model.units

import io.nacular.measured.units.Units

/**
 * Represents quantity of electric current.
 */
public class Electricity(suffix: String, ratio: Double = 1.0) : Units(suffix, ratio) {
    public companion object {
        public val ampere: Electricity = Electricity("A")
    }
}
