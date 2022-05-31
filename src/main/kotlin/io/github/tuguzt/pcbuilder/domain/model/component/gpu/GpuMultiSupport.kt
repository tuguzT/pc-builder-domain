package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.Serializable

/**
 * [CrossFireX] or [SLI] support of the [graphics processing unit][GraphicsProcessingUnit].
 */
@Serializable
public sealed interface GpuMultiSupport {
    /**
     * `CrossFireX` is AMD’s multi-GPU solution.
     */
    @Serializable
    public data class CrossFireX(public val wayCount: WayCount) : GpuMultiSupport {
        /**
         * Count of GPUs to be supported by [CrossFireX].
         */
        @Serializable
        public enum class WayCount(public val count: UInt) {
            TwoWay(count = 2u),
            ThreeWay(count = 3u),
            FourWay(count = 4u),
        }
    }

    /**
     * `Scalable Link Interface` (or [SLI]) is NVIDIA’s multi-GPU solution.
     */
    @Serializable
    public data class SLI(public val wayCount: WayCount) : GpuMultiSupport {
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
