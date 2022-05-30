@file:UseSerializers(MeasureSerializer::class, MassSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MassSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.nacular.measured.units.Mass
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Weight of the [component][Component].
 */
@JvmInline
@Serializable
public value class Weight(internal val weight: Measure<Mass>)

/**
 * Represents [weight][Weight] as [measure][Measure] of mass.
 */
public fun Weight.asMeasure(): Measure<Mass> = weight
