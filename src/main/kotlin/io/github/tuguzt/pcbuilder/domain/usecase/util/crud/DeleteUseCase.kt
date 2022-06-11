package io.github.tuguzt.pcbuilder.domain.usecase.util.crud

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.repository.util.crud.DeleteRepository

public open class DeleteUseCase<Id, T : Identifiable<Id>, Error>(
    private val repository: DeleteRepository<Id, T, Error>,
) : suspend (T) -> Result<Unit, Error> {
    override suspend operator fun invoke(item: T): Result<Unit, Error> = repository.delete(item)
}
