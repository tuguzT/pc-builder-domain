package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * [CrossFireX] or [SLI] support of the [motherboard][Motherboard].
 */
@Serializable
public sealed interface MotherboardMultiGpuSupport {
    /**
     * `CrossFireX` is AMD’s multi-GPU solution for [motherboard][Motherboard].
     */
    @Serializable
    public object CrossFireX : MotherboardMultiGpuSupport

    /**
     * `Scalable Link Interface` (or [SLI]) is NVIDIA’s multi-GPU solution.
     */
    @Serializable
    public data class SLI(public val wayCount: WayCount) : MotherboardMultiGpuSupport {
        /**
         * Count of GPUs to be supported by [SLI].
         */
        @Serializable
        public enum class WayCount(public val count: UInt) {
            TwoWay(count = 2u),
            ThreeWay(count = 3u),
            FourWay(count = 4u),
        }
    }
}
