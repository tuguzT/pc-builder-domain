@file:UseSerializers(MeasureSerializer::class, BinarySizeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.storage

import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.BinarySizeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.BinarySize.Companion.gigabytes
import io.nacular.measured.units.Measure
import io.nacular.measured.units.times
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Maximum capacity of the [storage][Storage].
 */
@JvmInline
@Serializable
public value class StorageCapacity(internal val capacity: Measure<BinarySize>) {
    init {
        require(capacity >= 1 * gigabytes) { "Storage capacity must be greater than 1 GB, got $capacity" }
    }
}

/**
 * Represents [storage capacity][StorageCapacity]
 * as [measure][Measure] of [binary size][BinarySize].
 */
public fun StorageCapacity.asMeasure(): Measure<BinarySize> = capacity
