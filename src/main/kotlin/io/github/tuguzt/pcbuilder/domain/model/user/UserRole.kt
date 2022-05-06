package io.github.tuguzt.pcbuilder.domain.model.user

import kotlinx.serialization.Serializable

/**
 * Role of user in the application.
 */
@Serializable
public enum class UserRole {
    User,
    Moderator,
    Administrator,
}
