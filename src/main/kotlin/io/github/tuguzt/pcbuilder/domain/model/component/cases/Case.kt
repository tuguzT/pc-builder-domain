package io.github.tuguzt.pcbuilder.domain.model.component.cases

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.MotherboardFormFactor

/**
 * Interface for all cases of PC.
 */
public interface Case : Component {
    public val type: CaseType
    public val powerSupply: CasePowerSupply?
    public val powerSupplyShroud: CasePowerSupplyShroud
    public val sidePanelWindow: CaseSidePanelWindow?
    public val motherboardFormFactors: List<MotherboardFormFactor>
    public val driveBays: CaseDriveBays
    public val expansionSlots: CaseExpansionSlots
}
