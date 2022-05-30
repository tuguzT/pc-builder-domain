@file:UseSerializers(MeasureSerializer::class, TimeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.TimeSerializer
import io.nacular.measured.units.Measure
import io.nacular.measured.units.Time
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Response time of the [monitor][Monitor].
 */
@JvmInline
@Serializable
public value class MonitorResponseTime(internal val time: Measure<Time>)

/**
 * Represents [response time][MonitorResponseTime] as [measure][Measure] of time.
 */
public fun MonitorResponseTime.asMeasure(): Measure<Time> = time
