@file:UseSerializers(MeasureSerializer::class, NoiseLevelSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import io.github.tuguzt.pcbuilder.domain.model.serialization.NoiseLevelSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.NoiseLevel
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Noise level of the [cooler][Cooler].
 */
@JvmInline
@Serializable
public value class CoolerNoiseLevel(internal val value: Measure<NoiseLevel>)

/**
 * Represents [cooler noise level][CoolerNoiseLevel]
 * as [measure][Measure] of [noise level][NoiseLevel].
 */
public fun CoolerNoiseLevel.asMeasure(): Measure<NoiseLevel> = value
