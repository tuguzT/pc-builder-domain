package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import kotlinx.serialization.Serializable

/**
 * If the [cooler][Cooler] has a fan.
 */
@Suppress("SpellCheckingInspection")
@Serializable
public enum class CoolerFanType {
    WithFan,
    Fanless,
}
