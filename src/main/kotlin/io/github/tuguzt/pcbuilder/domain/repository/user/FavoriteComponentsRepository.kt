package io.github.tuguzt.pcbuilder.domain.repository.user

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.PolymorphicComponent
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface FavoriteComponentsRepository<Error> : CrudRepository<NanoId, PolymorphicComponent, Error>
