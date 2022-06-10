@file:UseSerializers(
    MeasureSerializer::class,
    UnitsRatioSerializer::class,
    BinarySizeSerializer::class,
    TimeSerializer::class,
)

package io.github.tuguzt.pcbuilder.domain.model.component.storage

import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.BinarySizeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.UnitsRatioSerializer
import io.nacular.measured.units.BinarySize.Companion.gigabits
import io.nacular.measured.units.Measure
import io.nacular.measured.units.Time.Companion.seconds
import io.nacular.measured.units.div
import io.nacular.measured.units.times
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Interface type of the [storage][Storage].
 */
@Serializable
public sealed interface StorageInterface {
    /**
     * Serial ATA [storage][Storage] interface.
     */
    @Serializable
    public enum class SATA(public val transferRate: Measure<TransferRate>) : StorageInterface {
        SATAv1(transferRate = 1.5 * gigabits / seconds),
        SATAv2(transferRate = 3 * gigabits / seconds),
        SATAv3(transferRate = 6 * gigabits / seconds),
    }

    /**
     *  Serial Attached SCSI (Small Computer System Interface) [storage][Storage] interface.
     */
    @Serializable
    public enum class SAS(public val transferRate: Measure<TransferRate>) : StorageInterface {
        SASv1(transferRate = 3 * gigabits / seconds),
        SASv2(transferRate = 6 * gigabits / seconds),
        SASv3(transferRate = 12 * gigabits / seconds),
        SASv4(transferRate = 22.5 * gigabits / seconds),
    }

    /**
     * Peripheral Component Interconnect Express [storage][Storage] interface.
     */
    @Suppress("EnumEntryName")
    @Serializable
    public enum class PCIe(public val lineCount: UByte) : StorageInterface {
        PCIe_x1(lineCount = 1u),
        PCIe_x2(lineCount = 2u),
        PCIe_x4(lineCount = 4u),
        PCIe_x8(lineCount = 8u),
        PCIe_x16(lineCount = 16u),
    }

    /**
     *  Micro [SATA] [storage][Storage] interface.
     */
    @Serializable
    public enum class MicroSATA(public val transferRate: Measure<TransferRate>) : StorageInterface {
        MicroSATAv1(transferRate = 3 * gigabits / seconds),
        MicroSATAv2(transferRate = 6 * gigabits / seconds),
    }

    /**
     *  Mini [SATA] (or mSATA) [storage][Storage] interface.
     */
    @Serializable
    public object MiniSATA : StorageInterface {
        override fun toString(): String = "mSATA"
    }

    /**
     * Parallel AT Attachment [storage][Storage] interface.
     *
     * Before the existence of [SATA], it was called ATA.
     */
    @Suppress("SpellCheckingInspection", "EnumEntryName")
    @Serializable
    public enum class PATA : StorageInterface {
        PATA_100,
        PATA_44Pin_100,
        PATA_44Pin_133;

        override fun toString(): String = name.replace('_', ' ').replace("Pin", "-Pin")
    }

    /**
     * U.2 (formerly known as SFF-8639) is an SSD [storage][Storage] interface.
     */
    @Suppress("SpellCheckingInspection")
    @Serializable
    public object Udot2 : StorageInterface {
        override fun toString(): String = "U.2"
    }

    /**
     * M.2 [storage][Storage] interface.
     */
    @Suppress("SpellCheckingInspection")
    @Serializable
    public enum class Mdot2 {
        BplusM,
        E,
        M,
    }
}
