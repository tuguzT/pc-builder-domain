package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Interface type of the [graphics processing unit][GraphicsProcessingUnit].
 */
public sealed interface GpuInterface {
    /**
     * AGP interface type.
     */
    @Serializable
    @SerialName("AGP")
    public object AGP : GpuInterface {
        override fun toString(): String = "AGP"
    }

    /**
     * PCI interface type.
     */
    @Serializable
    @SerialName("PCI")
    public object PCI : GpuInterface {
        override fun toString(): String = "PCI"
    }

    /**
     * PCI Express interface type.
     */
    @Suppress("EnumEntryName")
    @Serializable
    @SerialName("PCIe")
    public enum class PCIe(public val lineCount: UByte) : GpuInterface {
        PCIe_x1(lineCount = 1u),
        PCIe_x2(lineCount = 2u),
        PCIe_x4(lineCount = 4u),
        PCIe_x8(lineCount = 8u),
        PCIe_x16(lineCount = 16u);

        override fun toString(): String = "PCIe x$lineCount"
    }
}
