package io.github.tuguzt.pcbuilder.domain.model.component.monitor

/**
 * Data class represents aspect ratio of the monitor.
 *
 * @see Monitor
 */
public data class AspectRatio(val width: UInt, val height: UInt) {
    override fun toString(): String = "$width:$height"
}
