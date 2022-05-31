package io.github.tuguzt.pcbuilder.domain.model.component.cases

import kotlinx.serialization.Serializable

/**
 * Side panel window of the [case][Case].
 */
@Serializable
public enum class CaseSidePanelWindow {
    Acrylic,
    Mesh,
    TintedAcrylic,
    TemperedGlass,
    TintedTemperedGlass,
}
