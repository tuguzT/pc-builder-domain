package io.github.tuguzt.pcbuilder.domain.repository.util.crud

import io.github.tuguzt.pcbuilder.domain.model.Identifiable

public interface ReadByIdRepository<I, T : Identifiable<I>> {
    public suspend fun readById(id: I): T?
}
