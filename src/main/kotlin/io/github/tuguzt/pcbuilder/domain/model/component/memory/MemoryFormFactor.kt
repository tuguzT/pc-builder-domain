package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Form factors type of the [memory][Memory].
 */
@Serializable
public sealed interface MemoryFormFactor {
    /** Dual In-line Memory Module */
    @Serializable
    public data class DIMM(public val pins: Pins) : MemoryFormFactor {
        /**
         * Represents possible count of pins for [DIMM] memory form factor.
         */
        @Serializable
        public enum class Pins(public val count: UInt) {
            Pins100(100u),
            Pins168(168u),
            Pins184(184u),
            Pins240(240u),
            Pins288(288u),
        }
    }

    /**
     * Small Outline [DIMM] (Dual In-line Memory Module)
     */
    @Serializable
    public data class SmallOutlineDIMM(public val pins: Pins) : MemoryFormFactor {
        /**
         * Represents possible count of pins for [SO-DIMM][SmallOutlineDIMM] memory form factor.
         */
        @Serializable
        public enum class Pins(public val count: UInt) {
            Pins100(100u),
            Pins144(144u),
            Pins200(200u),
            Pins204(204u),
            Pins260(260u),
        }
    }
}
