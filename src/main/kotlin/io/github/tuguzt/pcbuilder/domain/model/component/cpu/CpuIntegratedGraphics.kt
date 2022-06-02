package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Integrated graphics types of [CPU].
 */
@Serializable
public sealed interface CpuIntegratedGraphics {
    /**
     * Intel [integrated graphics][CpuIntegratedGraphics].
     */
    @Serializable
    public sealed interface Intel : CpuIntegratedGraphics {
        /**
         * [Intel] HD series.
         */
        @Suppress("EnumEntryName")
        @Serializable
        public enum class HD : Intel {
            Graphics,
            Graphics_510,
            Graphics_530,
            Graphics_610,
            Graphics_630,
            Graphics_2000,
            Graphics_2500,
            Graphics_3000,
            Graphics_4000,
            Graphics_4400,
            Graphics_4600,
            Graphics_P530,
            Graphics_P630,
            Graphics_P4000,
            Graphics_P4600;

            override fun toString(): String = "Intel HD ${name.replace('_', ' ')}"
        }

        /**
         * [Intel] UHD series.
         */
        @Suppress("EnumEntryName")
        @Serializable
        public enum class UHD : Intel {
            Graphics_610,
            Graphics_630,
            Graphics_710,
            Graphics_730,
            Graphics_750,
            Graphics_770;

            override fun toString(): String = "Intel UHD ${name.replace('_', ' ')}"
        }
    }

    /**
     * Iris [integrated graphics][CpuIntegratedGraphics].
     */
    @Serializable
    public sealed interface Iris : CpuIntegratedGraphics {
        @Suppress("EnumEntryName")
        @Serializable
        public enum class Pro : Iris {
            Graphics_6200;

            override fun toString(): String = "Iris Pro ${name.replace('_', ' ')}"
        }
    }

    /**
     * Radeon [integrated graphics][CpuIntegratedGraphics].
     */
    @Suppress("SpellCheckingInspection")
    @Serializable
    public sealed interface Radeon : CpuIntegratedGraphics {
        /**
         * [Radeon] HD series.
         */
        @Suppress("EnumEntryName")
        @Serializable
        public enum class HD : Radeon {
            HD_6370D,
            HD_6410D,
            HD_6530D,
            HD_6550D,
            HD_7480D,
            HD_7540D,
            HD_7560D,
            HD_7660D,
            HD_8000_Series,
            HD_8240,
            HD_8280,
            HD_8370D,
            HD_8400,
            HD_8470D,
            HD_8570D,
            HD_8650D,
            HD_8670D;

            override fun toString(): String = "Radeon ${name.replace('_', ' ')}"
        }

        /**
         * [Radeon] Vega series.
         */
        @Suppress("EnumEntryName")
        @Serializable
        public enum class Vega : Radeon {
            Vega_3,
            Vega_7,
            Vega_8,
            Vega_11;

            override fun toString(): String = "Radeon ${name.replace('_', ' ')}"
        }
    }
}
