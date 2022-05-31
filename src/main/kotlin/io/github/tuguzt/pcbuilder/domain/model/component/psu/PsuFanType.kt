package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * If the [power supply unit][PowerSupplyUnit] has a fan.
 */
@Suppress("SpellCheckingInspection")
@Serializable
public enum class PsuFanType {
    WithFan,
    Fanless,
}
