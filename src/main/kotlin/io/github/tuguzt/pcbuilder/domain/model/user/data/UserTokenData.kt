package io.github.tuguzt.pcbuilder.domain.model.user.data

import io.github.tuguzt.pcbuilder.domain.model.user.UserToken
import kotlinx.serialization.Serializable

/**
 * Serializable data of [user token][UserToken].
 */
@Serializable
public data class UserTokenData(override val accessToken: String) : UserToken
