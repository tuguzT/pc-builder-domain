package io.github.tuguzt.pcbuilder.domain.repository.util.crud

import io.github.tuguzt.pcbuilder.domain.model.Identifiable

public interface ReadAllRepositoryService<I, T : Identifiable<I>> {
    public suspend fun readAll(): List<T>
}
