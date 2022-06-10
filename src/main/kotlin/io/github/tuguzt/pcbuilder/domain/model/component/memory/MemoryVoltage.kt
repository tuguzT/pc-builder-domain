@file:UseSerializers(
    MeasureSerializer::class,
    UnitsRatioSerializer::class,
    ElectricitySerializer::class,
    UnitsProductSerializer::class,
    LengthSerializer::class,
    MassSerializer::class,
    TimeSerializer::class,
)

package io.github.tuguzt.pcbuilder.domain.model.component.memory

import io.github.tuguzt.pcbuilder.domain.model.serialization.ElectricitySerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.LengthSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MassSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.UnitsProductSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.UnitsRatioSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Voltage
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Voltage of the [memory][Memory].
 */
@JvmInline
@Serializable
public value class MemoryVoltage(internal val voltage: Measure<Voltage>)

/**
 * Represents [memory voltage][MemoryVoltage] as [measure][Measure] of voltage.
 */
public fun MemoryVoltage.asMeasure(): Measure<Voltage> = voltage
