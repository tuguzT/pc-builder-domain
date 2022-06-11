package io.github.tuguzt.pcbuilder.domain.repository.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable

public interface ReadAllRepository<Id, T : Identifiable<Id>, Error> {
    public suspend fun readAll(): Result<List<T>, Error>
}
