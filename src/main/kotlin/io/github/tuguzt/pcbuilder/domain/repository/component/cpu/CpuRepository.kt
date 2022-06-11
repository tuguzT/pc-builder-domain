package io.github.tuguzt.pcbuilder.domain.repository.component.cpu

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.CpuData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface CpuRepository<Error> : CrudRepository<NanoId, CpuData, Error>
