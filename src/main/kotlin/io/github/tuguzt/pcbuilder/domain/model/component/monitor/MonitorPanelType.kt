package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Enum represents all panel types of the [monitor][Monitor].
 */
@Serializable
public enum class MonitorPanelType {
    /** Twisted Nematic */
    TN,

    /** In-Plane-Switching */
    IPS,

    /** Plane to Line Switching */
    PLS,

    /** Advanced Hyper-Viewing Angle */
    AHVA,

    /** Vertical Alignment */
    VA,

    /** Multidomain Vertical Alignment */
    MVA,

    /** Patterned Vertical Alignment */
    PVA,

    /** Organic Light-Emitting Diode */
    OLED,
}
