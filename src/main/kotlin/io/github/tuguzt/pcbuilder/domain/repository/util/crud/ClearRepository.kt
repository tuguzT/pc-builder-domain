package io.github.tuguzt.pcbuilder.domain.repository.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable

public interface ClearRepository<Id, T : Identifiable<Id>, Error> {
    public suspend fun clear(): Result<Unit, Error>
}
