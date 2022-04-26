package io.github.tuguzt.pcbuilder.domain.model.user

import kotlinx.serialization.Serializable

@Serializable
public enum class UserRole {
    User,
    Moderator,
    Administrator,
}
