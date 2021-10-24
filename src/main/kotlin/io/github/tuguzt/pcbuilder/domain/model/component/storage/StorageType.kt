package io.github.tuguzt.pcbuilder.domain.model.component.storage

/**
 * Sealed class represents all possible types of storages.
 *
 * @see Storage
 */
public sealed class StorageType {
    /** Hard Disk Drive */
    public data class HDD(val revolutionsPerMinute: UInt) : StorageType() {
        init {
            require(revolutionsPerMinute > 0u) { "RPM of HDD must be greater than 0" }
        }
    }

    /** Solid-State Drive */
    public class SSD(public val hasNVMe: Boolean) : StorageType()

    /**
     * Dual-drive hybrid systems or solid-state hybrid drives (SSHD)
     *
     * @see HDD
     * @see SSD
     */
    public object Hybrid : StorageType()
}
