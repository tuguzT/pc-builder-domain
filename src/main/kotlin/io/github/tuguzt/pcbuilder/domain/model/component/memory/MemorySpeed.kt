@file:UseSerializers(MeasureSerializer::class, InverseUnitsSerializer::class, TimeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.memory

import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Frequency
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * [Memory] speed.
 */
@JvmInline
@Serializable
public value class MemorySpeed(internal val speed: Measure<Frequency>)

/**
 * Represent [memory speed][MemorySpeed] as [measure][Measure] of frequency.
 */
public fun MemorySpeed.asMeasure(): Measure<Frequency> = speed
