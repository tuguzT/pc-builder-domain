@file:UseSerializers(MeasureSerializer::class, InverseUnitsSerializer::class, TimeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Frequency
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Refresh rate of the [monitor][Monitor].
 */
@JvmInline
@Serializable
public value class MonitorRefreshRate(internal val rate: Measure<Frequency>)

/**
 * Represents [refresh rate][MonitorRefreshRate] as [measure][Measure] of frequency.
 */
public fun MonitorRefreshRate.asMeasure(): Measure<Frequency> = rate
