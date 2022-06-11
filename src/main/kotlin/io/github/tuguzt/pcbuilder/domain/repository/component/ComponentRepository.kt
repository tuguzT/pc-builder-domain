package io.github.tuguzt.pcbuilder.domain.repository.component

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.PolymorphicComponent
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface ComponentRepository<Error> : CrudRepository<NanoId, PolymorphicComponent, Error> {
    public suspend fun readByName(name: String): Result<PolymorphicComponent?, Error>
}
