@file:UseSerializers(
    MeasureSerializer::class,
    UnitsRatioSerializer::class,
    UnitsProductSerializer::class,
    LengthSerializer::class,
    MassSerializer::class,
    TimeSerializer::class,
)

package io.github.tuguzt.pcbuilder.domain.model.component.psu

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
 * Overall wattage of the [power supply unit][PowerSupplyUnit].
 */
@JvmInline
@Serializable
public value class PowerSupplyUnitWattage(internal val wattage: Measure<Power>)

/**
 * Represents [power supply unit wattage][PowerSupplyUnitWattage]
 * as [measure][Measure] of [power][Power].
 */
public fun PowerSupplyUnitWattage.asMeasure(): Measure<Power> = wattage
