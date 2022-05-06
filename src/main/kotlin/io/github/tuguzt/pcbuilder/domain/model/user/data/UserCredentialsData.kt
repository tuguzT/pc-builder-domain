package io.github.tuguzt.pcbuilder.domain.model.user.data

import io.github.tuguzt.pcbuilder.domain.model.user.UserCredentials
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [user credentials][UserCredentials].
 */
@Serializable
public data class UserCredentialsData(
    override val username: String,
    override val password: String,
) : UserCredentials
