package io.github.tuguzt.pcbuilder.domain.model.units

import io.nacular.measured.units.Units

/**
 * Represents quantity of luminous intensity.
 */
public class LuminousIntensity(suffix: String, ratio: Double = 1.0) : Units(suffix, ratio) {
    public companion object {
        public val candela: LuminousIntensity = LuminousIntensity("cd")
    }
}
