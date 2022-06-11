package io.github.tuguzt.pcbuilder.domain.usecase

/**
 * Use case for password validation.
 */
public class CheckPasswordUseCase : (String) -> Boolean {
    /**
     * Checks if the provided [password] meets all requirements of the module.
     *
     * Requirements are:
     * - must be from 8 characters in length
     * - must contain at least one upper case latin letter
     * - must contain at least one lower case latin letter
     * - must contain at least one digit
     * - must contain at least one special character: `(`, `)`, `#`, `?`, `!`, `@`, `$`, `%`, `^`, `&`, `*`, `_`, or `-`
     */
    override operator fun invoke(password: String): Boolean = passwordRegex matches password
}

/**
 * Regular expression for password validation.
 */
public val passwordRegex: Regex = Regex("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?\\d)(?=.*?[()#?!@$%^&*_-]).{8,}\$")
