package io.github.tuguzt.pcbuilder.domain.model.component.monitor

/**
 * Data class represents resolution of the monitor in pixels.
 *
 * @see Monitor
 */
public data class MonitorResolution(val width: UInt, val height: UInt) {
    override fun toString(): String = "$width × $height"
}
