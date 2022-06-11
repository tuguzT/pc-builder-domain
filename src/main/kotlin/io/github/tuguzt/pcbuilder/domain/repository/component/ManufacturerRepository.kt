package io.github.tuguzt.pcbuilder.domain.repository.component

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.ManufacturerData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface ManufacturerRepository<Error> : CrudRepository<NanoId, ManufacturerData, Error> {
    public suspend fun readByName(name: String): Result<ManufacturerData?, Error>
}
