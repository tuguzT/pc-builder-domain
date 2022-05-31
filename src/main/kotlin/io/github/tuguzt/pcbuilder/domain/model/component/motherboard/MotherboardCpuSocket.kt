package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import io.github.tuguzt.pcbuilder.domain.model.component.cpu.CpuSocket
import kotlinx.serialization.Serializable

/**
 * CPU socket of the [motherboard][Motherboard].
 */
@Serializable
public sealed interface MotherboardCpuSocket {
    /**
     * Standard CPU socket types.
     */
    @Suppress("EnumEntryName")
    @Serializable
    public data class Standard(public val socket: CpuSocket) : MotherboardCpuSocket

    /**
     * Integrated CPU socket types.
     */
    @Suppress("EnumEntryName")
    @Serializable
    public enum class Integrated : MotherboardCpuSocket {
        A4_5000,
        AthlonII_X2_215,
        Atom230,
        Atom330,
        AtomC2358,
        AtomC2550,
        AtomC2750,
        AtomD410,
        AtomD425,
        AtomD510,
        AtomD525,
        AtomD2500,
        AtomD2550,
        AtomD2700,
        AtomN550,
        CSeries_C70,
        Celeron847,
        Celeron1037U,
        CeleronJ1900,
        CeleronN3050,
        CeleronN3150,
        ESeries_E350,
        ESeries_E450,
        PentiumJ3710,
        PentiumN3700,
        Xeon_D1520,
        Xeon_D1521,
        Xeon_D1537,
        Xeon_D1541,
    }
}
