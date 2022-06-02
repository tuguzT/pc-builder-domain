package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Socket type of the [CPU].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class CpuSocket {
    AM1,
    AM2Plus,
    AM3,
    AM3Plus,
    AM4,
    C32,
    FM1,
    FM2,
    FM2Plus,
    G34,
    LGA771,
    LGA775,
    LGA1150,
    LGA1151,
    LGA1155,
    LGA1156,
    LGA1200,
    LGA1356,
    LGA1366,
    LGA1700,
    LGA2011,
    LGA2011_3,
    LGA2011_3_Narrow,
    LGA2066,
    LGA3647,
    sTR4,
    sTRX4,
    sWRX8;

    override fun toString(): String = name.replace("Plus", "+").replace('_', ' ')
}
