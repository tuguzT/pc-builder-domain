package io.github.tuguzt.pcbuilder.domain.model.component.cases

import kotlinx.serialization.Serializable

/**
 * Drive bays of the [case][Case].
 */
@Serializable
public data class CaseDriveBays(
    public val external5_25_count: UInt,
    public val external3_5_count: UInt,
    public val internal3_5_count: UInt,
    public val internal2_5_count: UInt,
)
