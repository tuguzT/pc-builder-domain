package io.github.tuguzt.pcbuilder.domain.model.component.storage

import kotlinx.serialization.Serializable

/**
 * Sealed class represents all possible types of [storages][Storage].
 */
@Serializable
public sealed class StorageType {
    /** Hard Disk Drive */
    @Serializable
    public data class HDD(val revolutionsPerMinute: UInt) : StorageType() {
        init {
            require(revolutionsPerMinute > 0u) { "RPM of HDD must be greater than 0" }
        }
    }

    /** Solid-State Drive */
    @Serializable
    public data class SSD(public val hasNVMe: Boolean) : StorageType()

    /**
     * Dual-drive hybrid systems or solid-state hybrid drives (SSHD)
     * which combine [HDD] and [SSD].
     */
    @Serializable
    public object Hybrid : StorageType()
}
