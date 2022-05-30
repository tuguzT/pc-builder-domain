package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Data class represents contrast ratio of the monitor.
 *
 * @see Monitor
 */
@Serializable
public data class MonitorContrastRatio(val higherLuminance: UInt, val lowerLuminance: UInt) {
    override fun toString(): String = "$higherLuminance:$lowerLuminance"
}
