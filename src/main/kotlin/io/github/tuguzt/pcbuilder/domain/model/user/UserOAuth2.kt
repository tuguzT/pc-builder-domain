package io.github.tuguzt.pcbuilder.domain.model.user

/**
 * User which has [accessToken] field from the OAuth 2.0 provider.
 *
 * @see User
 */
public interface UserOAuth2 : User, UserToken {
    public override val accessToken: String
}
