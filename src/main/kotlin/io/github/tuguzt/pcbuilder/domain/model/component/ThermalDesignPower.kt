@file:UseSerializers(
    MeasureSerializer::class,
    UnitsRatioSerializer::class,
    UnitsProductSerializer::class,
    LengthSerializer::class,
    MassSerializer::class,
    TimeSerializer::class,
)

package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.LengthSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MassSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.UnitsProductSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.UnitsRatioSerializer
import io.github.tuguzt.pcbuilder.domain.model.component.cpu.CPU
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GPU
import io.github.tuguzt.pcbuilder.domain.model.units.Power
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Thermal design power (or TDP) of the processing unit ([CPU] or [GPU]).
 *
 * It is the maximum amount of heat generated by a computer chip or component
 * that the cooling system in a computer is designed to dissipate under any workload.
 */
@JvmInline
@Serializable
public value class ThermalDesignPower(internal val power: Measure<Power>)

/**
 * Represents [thermal design power][ThermalDesignPower] as [measure][Measure] of power.
 */
public fun ThermalDesignPower.asMeasure(): Measure<Power> = power

/**
 * Shorthand for [thermal design power][ThermalDesignPower].
 */
public typealias TDP = ThermalDesignPower