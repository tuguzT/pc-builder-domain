package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * Form factor of the [motherboard][Motherboard].
 */
@Serializable
public enum class MotherboardFormFactor {
    AT,
    ATX,
    EATX,
    FlexATX,
    HPTX,
    MicroATX,
    MiniITX,
    ThinMiniITX,
    MiniDTX,
    SSI_CEB,
    SSI_EEB,
    XL_ATX,
}
