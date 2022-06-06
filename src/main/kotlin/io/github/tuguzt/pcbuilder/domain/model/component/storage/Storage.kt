package io.github.tuguzt.pcbuilder.domain.model.component.storage

import io.github.tuguzt.pcbuilder.domain.model.component.Component

/**
 * Interface for all storages of PC.
 */
public interface Storage : Component {
    public val storageType: StorageType
    public val `interface`: StorageInterface
    public val formFactor: StorageFormFactor
    public val capacity: StorageCapacity
    public val cache: StorageCache
}
