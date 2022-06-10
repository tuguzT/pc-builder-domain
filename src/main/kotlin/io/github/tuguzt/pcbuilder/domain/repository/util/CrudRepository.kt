package io.github.tuguzt.pcbuilder.domain.repository.util

import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.*

public interface CrudRepository<I, T : Identifiable<I>> :
    ReadAllRepositoryService<I, T>,
    ReadByIdRepository<I, T>,
    SaveRepository<I, T>,
    DeleteRepository<I, T>,
    ClearRepository<I, T>
