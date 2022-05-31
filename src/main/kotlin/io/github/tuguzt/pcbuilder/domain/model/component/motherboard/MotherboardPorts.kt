package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * Ports of the [motherboard][Motherboard].
 */
@Serializable
public data class MotherboardPorts(
    public val sata3GBpSecCount: UShort,
    public val sata6GBpSecCount: UShort,
)
