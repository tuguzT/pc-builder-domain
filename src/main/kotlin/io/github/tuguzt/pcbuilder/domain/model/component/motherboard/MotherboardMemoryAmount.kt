@file:UseSerializers(MeasureSerializer::class, BinarySizeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.BinarySizeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.BinarySize.Companion.gigabytes
import io.nacular.measured.units.Measure
import io.nacular.measured.units.times
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Maximum amount of memory for the [motherboard][Motherboard].
 */
@JvmInline
@Serializable
public value class MotherboardMemoryAmount(internal val amount: Measure<BinarySize>) {
    init {
        require(amount > 1 * gigabytes) { "Memory amount must be greater than 1 GB, got $amount" }
    }
}

/**
 * Represents [memory amount][MotherboardMemoryAmount] as [measure][Measure] of binary size.
 */
public fun MotherboardMemoryAmount.asMeasure(): Measure<BinarySize> = amount
