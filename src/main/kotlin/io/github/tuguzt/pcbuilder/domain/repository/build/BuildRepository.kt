package io.github.tuguzt.pcbuilder.domain.repository.build

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.build.BuildData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface BuildRepository<Error> : CrudRepository<NanoId, BuildData, Error> {
    public suspend fun readByName(name: String): Result<BuildData?, Error>
}
