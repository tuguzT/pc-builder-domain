package io.github.tuguzt.pcbuilder.domain.repository.util.crud

import io.github.tuguzt.pcbuilder.domain.model.Identifiable

public interface SaveRepository<I, T : Identifiable<I>> {
    public suspend fun save(item: T): T
}
