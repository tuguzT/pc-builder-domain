@file:UseSerializers(MeasureSerializer::class, BinarySizeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.storage

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.BinarySizeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.BinarySize.Companion.megabytes
import io.nacular.measured.units.Measure
import io.nacular.measured.units.times
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Maximum amount of cache of the [storage][Storage].
 */
@JvmInline
@Serializable
public value class StorageCache(internal val cache: Measure<BinarySize>) {
    init {
        require(cache >= 1 * megabytes) { "Storage capacity must be greater than 1 MB, got $cache" }
    }
}

/**
 * Represents [storage capacity][StorageCapacity]
 * as [measure][Measure] of [binary size][BinarySize].
 */
public fun StorageCache.asMeasure(): Measure<BinarySize> = cache
