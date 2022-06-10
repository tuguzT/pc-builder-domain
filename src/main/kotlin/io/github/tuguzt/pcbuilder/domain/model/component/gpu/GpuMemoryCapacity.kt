@file:UseSerializers(MeasureSerializer::class, BinarySizeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.BinarySizeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.BinarySize.Companion.gigabytes
import io.nacular.measured.units.Measure
import io.nacular.measured.units.times
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Maximum memory capacity of the [graphics processing unit][GraphicsProcessingUnit].
 */
@JvmInline
@Serializable
public value class GpuMemoryCapacity(internal val capacity: Measure<BinarySize>) {
    init {
        require(capacity >= 0.1 * gigabytes) { "Storage capacity must be greater than 0.1 GB, got $capacity" }
    }
}

/**
 * Represents [storage capacity][GpuMemoryCapacity]
 * as [measure][Measure] of [binary size][BinarySize].
 */
public fun GpuMemoryCapacity.asMeasure(): Measure<BinarySize> = capacity
