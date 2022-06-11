package io.github.tuguzt.pcbuilder.domain.usecase.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.ClearRepository

public open class ClearUseCase<Id, T : Identifiable<Id>, Error>(
    private val repository: ClearRepository<Id, T, Error>,
) : suspend () -> Result<Unit, Error> {
    override suspend operator fun invoke(): Result<Unit, Error> = repository.clear()
}
