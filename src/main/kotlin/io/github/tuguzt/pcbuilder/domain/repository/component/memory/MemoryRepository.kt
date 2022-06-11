package io.github.tuguzt.pcbuilder.domain.repository.component.memory

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.MemoryData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface MemoryRepository<Error> : CrudRepository<NanoId, MemoryData, Error>
