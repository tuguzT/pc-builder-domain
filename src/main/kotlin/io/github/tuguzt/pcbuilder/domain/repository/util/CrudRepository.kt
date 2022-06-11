package io.github.tuguzt.pcbuilder.domain.repository.util

import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.*

public interface CrudRepository<Id, T : Identifiable<Id>, Error> :
    ReadAllRepositoryService<Id, T, Error>,
    ReadByIdRepository<Id, T, Error>,
    SaveRepository<Id, T, Error>,
    DeleteRepository<Id, T, Error>,
    ClearRepository<Id, T, Error>
