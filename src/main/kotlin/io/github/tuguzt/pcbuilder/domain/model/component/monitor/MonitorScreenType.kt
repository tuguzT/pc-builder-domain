package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Enum represents screen type of the [monitor][Monitor].
 */
@Serializable
public enum class MonitorScreenType {
    Matte,
    Glossy,
}
