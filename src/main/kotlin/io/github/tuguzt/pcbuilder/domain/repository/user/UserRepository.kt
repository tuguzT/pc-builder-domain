package io.github.tuguzt.pcbuilder.domain.repository.user

import io.github.tuguzt.pcbuilder.domain.Result
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.user.data.UserData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface UserRepository<Error> : CrudRepository<NanoId, UserData, Error> {
    public suspend fun readByUsername(username: String): Result<UserData?, Error>
}
