package io.github.tuguzt.pcbuilder.domain.model.user

import io.github.tuguzt.pcbuilder.domain.model.Identifiable

/**
 * Basic interface for user data representation.
 */
public interface User : Identifiable<String> {
    public val role: UserRole
    public val username: String
    public val email: String?
    public val imageUri: String?
}
