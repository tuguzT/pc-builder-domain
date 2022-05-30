@file:UseSerializers(MeasureSerializer::class, InverseUnitsSerializer::class, TimeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Frequency
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Clock rate, or clock speed, of the [CPU].
 */
@JvmInline
@Serializable
public value class CpuClockRate(internal val rate: Measure<Frequency>)

/**
 * Represents [clock rate][CpuClockRate] as [measure][Measure] of frequency.
 */
public fun CpuClockRate.asMeasure(): Measure<Frequency> = rate
