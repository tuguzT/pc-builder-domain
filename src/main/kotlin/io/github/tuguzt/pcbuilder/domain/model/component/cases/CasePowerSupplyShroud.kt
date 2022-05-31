package io.github.tuguzt.pcbuilder.domain.model.component.cases

import kotlinx.serialization.Serializable

/**
 * If the [case][Case] has power sully shroud.
 */
@Serializable
public enum class CasePowerSupplyShroud {
    Shroud,
    NonShroud,
}
