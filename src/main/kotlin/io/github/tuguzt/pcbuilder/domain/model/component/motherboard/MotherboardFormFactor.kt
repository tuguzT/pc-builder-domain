package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * Form factor of the [motherboard][Motherboard].
 */
@Suppress("EnumEntryName", "SpellCheckingInspection")
@Serializable
public enum class MotherboardFormFactor {
    AT,
    ATX,
    EATX,
    Flex_ATX,
    HPTX,
    Micro_ATX,
    Mini_ITX,
    Thin_Mini_ITX,
    Mini_DTX,
    SSI_CEB,
    SSI_EEB,
    XL_ATX;

    override fun toString(): String = name.replace('_', ' ')
}
