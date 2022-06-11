package io.github.tuguzt.pcbuilder.domain.usecase.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.ReadAllRepository

public open class ReadAllUseCase<Id, T : Identifiable<Id>, Error>(
    private val repository: ReadAllRepository<Id, T, Error>,
) : suspend () -> Result<List<T>, Error> {
    override suspend operator fun invoke(): Result<List<T>, Error> = repository.readAll()
}
