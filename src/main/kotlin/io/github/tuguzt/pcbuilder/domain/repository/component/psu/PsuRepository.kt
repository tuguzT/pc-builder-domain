package io.github.tuguzt.pcbuilder.domain.repository.component.psu

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.PsuData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface PsuRepository<Error> : CrudRepository<NanoId, PsuData, Error>
