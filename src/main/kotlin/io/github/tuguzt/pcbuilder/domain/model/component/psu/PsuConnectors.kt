package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * Specifies connectors' count of the [power supply unit][PowerSupplyUnit].
 */
@Suppress("SpellCheckingInspection")
@Serializable
public data class PsuConnectors(
    public val epsCount: UByte,
    public val atxCount: UByte,
    public val pciExpress12pinCount: UByte,
    public val pciExpress8pinCount: UByte,
    public val pciExpress6plus2pinCount: UByte,
    public val pciExpress6pinCount: UByte,
    public val sataCount: UByte,
    public val molex4pinCount: UByte,
)
