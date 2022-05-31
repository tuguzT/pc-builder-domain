package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Count of cores the [CPU] has.
 */
@JvmInline
@Serializable
public value class CpuCoreCount(internal val count: UInt) {
    init {
        require(count > 0u) { "Count must be greater than zero" }
    }
}

/**
 * Converts [CpuCoreCount] object to [UInt] primitive.
 */
public fun CpuCoreCount.toUInt(): UInt = count
