package io.github.tuguzt.pcbuilder.domain.repository.component.motherboard

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.MotherboardData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface MotherboardRepository<Error> : CrudRepository<NanoId, MotherboardData, Error>
