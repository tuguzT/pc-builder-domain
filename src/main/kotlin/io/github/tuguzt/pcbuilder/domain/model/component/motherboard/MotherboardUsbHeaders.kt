package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * USB headers of the [motherboard][Motherboard].
 */
@Serializable
public data class MotherboardUsbHeaders(
    public val usb2HeaderCount: UByte,
    public val usb3gen1HeaderCount: UByte,
    public val usb3gen2HeaderCount: UByte,
    public val usb3gen2x2HeaderCount: UByte,
)
