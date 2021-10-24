package io.github.tuguzt.pcbuilder.domain.model.component.monitor

/**
 * Data class represents contrast ratio of the monitor.
 *
 * @see Monitor
 */
public data class ContrastRatio(val higherLuminance: UInt, val lowerLuminance: UInt) {
    override fun toString(): String = "$higherLuminance:$lowerLuminance"
}
