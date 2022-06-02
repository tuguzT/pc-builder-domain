package io.github.tuguzt.pcbuilder.domain.model.units

import io.nacular.measured.units.Units

/**
 * Represents quantity of noise.
 */
public class NoiseLevel(suffix: String, ratio: Double = 1.0) : Units(suffix, ratio) {
    public companion object {
        public val decibels: NoiseLevel = NoiseLevel("db")
    }
}
