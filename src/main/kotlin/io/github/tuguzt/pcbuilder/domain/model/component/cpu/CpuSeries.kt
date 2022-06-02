package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Series of the [central processing unit][CentralProcessingUnit].
 */
@Serializable
public sealed interface CpuSeries {
    /**
     * AMD series.
     */
    @Suppress("SpellCheckingInspection", "EnumEntryName")
    @Serializable
    public enum class AMD : CpuSeries {
        A4,
        A6,
        A8,
        A10,
        A12,
        Athlon,
        Athlon_II,
        Athlon_II_X2,
        Athlon_II_X3,
        Athlon_II_X4,
        Athlon_X2,
        Athlon_X4,
        E2_Series {
            override fun toString(): String = super.toString().replace(' ', '-')
        },
        FX,
        Opteron,
        Phenom_II_X2,
        Phenom_II_X3,
        Phenom_II_X4,
        Phenom_II_X6,
        Ryzen_3,
        Ryzen_5,
        Ryzen_7,
        Ryzen_9,
        Sempron,
        Sempron_X2,
        Threadripper;

        override fun toString(): String = "AMD ${name.replace('_', ' ')}"
    }

    /**
     * Intel series.
     */
    @Suppress("SpellCheckingInspection", "EnumEntryName")
    @Serializable
    public enum class Intel : CpuSeries {
        Celeron,
        Core_2_Duo,
        Core_2_Extreme,
        Core_2_Quad,
        Core_i3,
        Core_i5,
        Core_i7,
        Core_i7_Extreme,
        Core_i9,
        Pentium,
        Pentium_Gold,
        Xeon_E,
        Xeon_E3,
        Xeon_E5;

        override fun toString(): String = "Intel ${name.replace('_', ' ')}"
    }
}
