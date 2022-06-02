package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Data class represents aspect ratio of the [monitor][Monitor].
 */
@Serializable
public data class MonitorAspectRatio(val width: UInt, val height: UInt) {
    override fun toString(): String = "$width:$height"
}

public fun String.toMonitorAspectRatio(): MonitorAspectRatio {
    val data = split(':').take(2).map { it.trim().toUInt() }
    return MonitorAspectRatio(width = data[0], height = data[1])
}
