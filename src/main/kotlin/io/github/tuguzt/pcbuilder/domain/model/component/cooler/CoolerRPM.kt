package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import kotlinx.serialization.Serializable

/**
 * Revolutions per minute of the [cooler][Cooler] fan, if any.
 */
@Serializable
public data class CoolerRPM(internal val minimum: UInt, internal val maximum: UInt)

/**
 * Converts [cooler RPM][CoolerRPM] into the range.
 */
public fun CoolerRPM.toRange(): UIntRange = minimum..maximum
