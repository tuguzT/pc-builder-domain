package io.github.tuguzt.pcbuilder.domain.repository.component.storage

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.StorageData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface StorageRepository<Error> : CrudRepository<NanoId, StorageData, Error>
