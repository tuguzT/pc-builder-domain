@file:UseSerializers(
    MeasureSerializer::class,
    UnitsRatioSerializer::class,
    UnitsProductSerializer::class,
    LengthSerializer::class,
    MassSerializer::class,
    TimeSerializer::class,
)

package io.github.tuguzt.pcbuilder.domain.model.component.cases

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.LengthSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MassSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.UnitsProductSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.UnitsRatioSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Power
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Bundled power supply of the [case][Case], if any.
 */
@JvmInline
@Serializable
public value class CasePowerSupply(public val power: Measure<Power>)

/**
 * Represents [power supply][CasePowerSupply] as [measure][Measure] of power.
 */
public fun CasePowerSupply.asMeasure(): Measure<Power> = power
