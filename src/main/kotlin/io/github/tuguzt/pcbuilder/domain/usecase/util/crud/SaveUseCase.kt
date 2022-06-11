package io.github.tuguzt.pcbuilder.domain.usecase.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.SaveRepository

public open class SaveUseCase<Id, T : Identifiable<Id>, Error>(
    private val repository: SaveRepository<Id, T, Error>,
) : suspend (T) -> Result<T, Error> {
    override suspend operator fun invoke(item: T): Result<T, Error> = repository.save(item)
}
