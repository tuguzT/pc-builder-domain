package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Data class represents contrast ratio of the [monitor][Monitor].
 */
@Serializable
public data class MonitorContrastRatio(val higherLuminance: UInt, val lowerLuminance: UInt) {
    override fun toString(): String = "$higherLuminance:$lowerLuminance"
}

public fun String.toMonitorContrastRatio(): MonitorContrastRatio {
    val data = split(':').take(2).map { it.trim().toUInt() }
    return MonitorContrastRatio(higherLuminance = data[0], lowerLuminance = data[1])
}
