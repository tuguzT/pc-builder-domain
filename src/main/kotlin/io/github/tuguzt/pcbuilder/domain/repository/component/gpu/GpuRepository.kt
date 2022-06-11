package io.github.tuguzt.pcbuilder.domain.repository.component.gpu

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.GpuData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface GpuRepository<Error> : CrudRepository<NanoId, GpuData, Error>
