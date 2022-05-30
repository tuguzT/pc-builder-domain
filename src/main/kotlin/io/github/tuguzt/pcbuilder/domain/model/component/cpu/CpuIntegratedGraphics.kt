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
        @Serializable
        public enum class HD : Intel {
            Graphics,
            Graphics510,
            Graphics530,
            Graphics610,
            Graphics630,
            Graphics2000,
            Graphics2500,
            Graphics3000,
            Graphics4000,
            Graphics4400,
            Graphics4600,
            GraphicsP530,
            GraphicsP630,
            GraphicsP4000,
            GraphicsP4600,
        }

        /**
         * [Intel] UHD series.
         */
        @Serializable
        public enum class UHD : Intel {
            Graphics610,
            Graphics630,
            Graphics710,
            Graphics730,
            Graphics750,
            Graphics770,
        }
    }

    /**
     * Iris [integrated graphics][CpuIntegratedGraphics].
     */
    @Serializable
    public sealed interface Iris : CpuIntegratedGraphics {
        @Serializable
        public enum class Pro : Iris {
            Graphics6200,
        }
    }

    /**
     * Radeon [integrated graphics][CpuIntegratedGraphics].
     */
    @Serializable
    public sealed interface Radeon : CpuIntegratedGraphics {
        /**
         * [Radeon] HD series.
         */
        @Serializable
        public enum class HD : Radeon {
            HD6370D,
            HD6410D,
            HD6530D,
            HD6550D,
            HD7480D,
            HD7540D,
            HD7560D,
            HD7660D,
            HD8000Series,
            HD8240,
            HD8280,
            HD8370D,
            HD8400,
            HD8470D,
            HD8570D,
            HD8650D,
            HD8670D,
        }

        /**
         * [Radeon] Vega series.
         */
        @Serializable
        public enum class Vega : Radeon {
            Vega3,
            Vega7,
            Vega8,
            Vega11,
        }
    }
}
