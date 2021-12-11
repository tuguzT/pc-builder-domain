package io.github.tuguzt.pcbuilder.domain.model.user

/**
 * User which has [password] field.
 *
 * @see User
 */
public interface UserPassword : User {
    public val password: String
}
