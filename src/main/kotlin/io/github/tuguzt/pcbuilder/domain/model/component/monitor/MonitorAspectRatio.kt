package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Data class represents aspect ratio of the [monitor][Monitor].
 */
@Serializable
public data class MonitorAspectRatio(val width: UInt, val height: UInt) {
    override fun toString(): String = "$width:$height"
}
