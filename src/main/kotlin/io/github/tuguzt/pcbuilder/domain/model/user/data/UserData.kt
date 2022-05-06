package io.github.tuguzt.pcbuilder.domain.model.user.data

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.model.user.User
import io.github.tuguzt.pcbuilder.domain.model.user.UserRole
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [user][User].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class UserData(
    @EncodeDefault
    override val id: String = randomNanoId(),

    override val role: UserRole,

    override val username: String,

    @EncodeDefault
    override val email: String? = null,

    @EncodeDefault
    override val imageUri: String? = null,
) : User
