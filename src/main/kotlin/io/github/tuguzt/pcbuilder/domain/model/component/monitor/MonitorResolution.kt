package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Data class represents resolution of the [monitor][Monitor] in pixels.
 */
@Serializable
public data class MonitorResolution(val width: UInt, val height: UInt) {
    override fun toString(): String = "$width x $height"
}

/**
 * Converts string to [monitor resolution][MonitorResolution].
 */
public fun String.toMonitorResolution(): MonitorResolution {
    val data = split('x').take(2).map { it.trim().toUInt() }
    return MonitorResolution(width = data[0], height = data[1])
}
