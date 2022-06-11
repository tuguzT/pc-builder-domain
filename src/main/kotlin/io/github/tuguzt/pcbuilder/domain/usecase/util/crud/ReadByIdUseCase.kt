package io.github.tuguzt.pcbuilder.domain.usecase.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.ReadByIdRepository

public open class ReadByIdUseCase<Id, T : Identifiable<Id>, Error>(
    private val repository: ReadByIdRepository<Id, T, Error>,
) : suspend (Id) -> Result<T?, Error> {
    override suspend operator fun invoke(id: Id): Result<T?, Error> = repository.readById(id)
}
