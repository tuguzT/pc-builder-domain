package io.github.tuguzt.pcbuilder.domain.model.user

/**
 * User which has [username] and [password] field.
 *
 * @see User
 */
public interface UserNamePassword : User {
    public val username: String
    public val password: String
}
