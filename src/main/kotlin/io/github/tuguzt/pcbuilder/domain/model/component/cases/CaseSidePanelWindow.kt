package io.github.tuguzt.pcbuilder.domain.model.component.cases

import kotlinx.serialization.Serializable

/**
 * Side panel window of the [case][Case].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class CaseSidePanelWindow {
    Acrylic,
    Mesh,
    Tinted_Acrylic,
    Tempered_Glass,
    Tinted_Tempered_Glass;

    override fun toString(): String = name.replace('_', ' ')
}
