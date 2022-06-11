package io.github.tuguzt.pcbuilder.domain.repository.component.cooler

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.CoolerData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface CoolerRepository<Error> : CrudRepository<NanoId, CoolerData, Error>
