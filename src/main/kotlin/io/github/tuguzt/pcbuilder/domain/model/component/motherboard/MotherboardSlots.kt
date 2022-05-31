package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * Slots of the [motherboard][Motherboard].
 */
@Serializable
public data class MotherboardSlots(
    public val pciExpressX16Count: UShort,
    public val pciExpressX8Count: UShort,
    public val pciExpressX4Count: UShort,
    public val pciExpressX1Count: UShort,
    public val pciCount: UShort,
    public val m2Count: UShort,
    public val mSataCount: UShort,
)
