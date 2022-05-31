package io.github.tuguzt.pcbuilder.domain.model.component.storage

import io.github.tuguzt.pcbuilder.domain.model.component.storage.StorageInterface.SATA
import kotlinx.serialization.Serializable

/**
 * Form factor of the [storage][Storage].
 */
@Serializable
public sealed interface StorageFormFactor {
    /**
     * 1.8" [storage][Storage] form factor.
     */
    @Serializable
    public object Inch1dot8 : StorageFormFactor

    /**
     * 2.5" [storage][Storage] form factor.
     */
    @Serializable
    public object Inch2dot5 : StorageFormFactor

    /**
     * 3.5" [storage][Storage] form factor.
     */
    @Serializable
    public object Inch3dot5 : StorageFormFactor

    /**
     * PCIe [storage][Storage] form factor.
     */
    @Serializable
    public object PCIe : StorageFormFactor

    /**
     * Mini [SATA] (or mSATA) [storage][Storage] form factor.
     */
    @Serializable
    public object MiniSATA : StorageFormFactor

    /**
     * M.2 (formerly Next Generation Form Factor (NGFF)) [storage][Storage] form factor.
     */
    @Suppress("SpellCheckingInspection")
    @Serializable
    public enum class Mdot2 : StorageFormFactor {
        M2_2242,
        M2_2260,
        M2_2280,
        M2_22110,
    }
}
