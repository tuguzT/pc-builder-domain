package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Count of threads the [CPU] has.
 */
@JvmInline
@Serializable
public value class CpuThreadCount(internal val count: UInt) {
    init {
        require(count > 0u) { "Count must be greater than zero" }
    }
}

/**
 * Converts [CpuThreadCount] object to [UInt] primitive.
 */
public fun CpuThreadCount.toUInt(): UInt = count
