@file:UseSerializers(MeasureSerializer::class, BinarySizeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.memory

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.BinarySizeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Data class represents module type of memory.
 *
 * @see Memory
 */
@Serializable
public data class MemoryModules(val count: UInt, val capacity: Measure<BinarySize>)
