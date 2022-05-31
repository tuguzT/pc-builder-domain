package io.github.tuguzt.pcbuilder.domain.model.component.cases

import kotlinx.serialization.Serializable

/**
 * Expansion slots of the [case][Case].
 */
@Serializable
public data class CaseExpansionSlots(
    public val fullHeightCount: UInt,
    public val halfHeightCount: UInt,
)
