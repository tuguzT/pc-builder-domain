package io.github.tuguzt.pcbuilder.domain.model.component.gpu

import kotlinx.serialization.Serializable

/**
 * Frame synchronization technology supported by the [graphics processing unit][GraphicsProcessingUnit].
 */
@Serializable
public enum class GpuFrameSyncType {
    /**
     * Announced by `AMD` to compete against `Nvidia`'s proprietary [G-Sync][GSync].
     */
    FreeSync,

    /**
     * `FreeSync Premium` mandates further requirements of
     * `Low Frame rate Compensation` `(LFC)` and at least 120 Hz refresh rate at FHD resolution.
     */
    FreeSyncPremium,

    /**
     * `FreeSync Premium Pro` adds luminance and wide color gamut requirements.
     */
    FreeSyncPremiumPro,

    /**
     * `G-Sync` is a proprietary adaptive sync technology developed by `Nvidia`.
     */
    GSync,

    /**
     * `G-Sync Ultimate` targets monitors with `High Dynamic Range` `(HDR)` content.
     */
    GSyncUltimate,

    /**
     * `G-Sync Compatible` means it was tested by `Nvidia`
     * to work as [G-Sync][GSync] with [FreeSync] monitors.
     */
    GSyncCompatible,
}
