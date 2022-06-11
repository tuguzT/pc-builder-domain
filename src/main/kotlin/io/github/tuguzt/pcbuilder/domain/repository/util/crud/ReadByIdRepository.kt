package io.github.tuguzt.pcbuilder.domain.repository.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable

public interface ReadByIdRepository<Id, T : Identifiable<Id>, Error> {
    public suspend fun readById(id: Id): Result<T?, Error>
}
