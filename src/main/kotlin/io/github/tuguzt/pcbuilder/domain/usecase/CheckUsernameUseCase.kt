package io.github.tuguzt.pcbuilder.domain.usecase

/**
 * Use case for username validation.
 */
public class CheckUsernameUseCase : (String) -> Boolean {
    /**
     * Checks if the provided [username] meets all requirements of the module.
     *
     * Requirements are:
     * - must be from 4 to 32 characters in length
     * - must contain latin or `-`, `_`, `.` characters
     * - must not start or end with `-`, `_`, `.` characters
     * - `-`, `_`, `.` characters can't be next to each other
     * - `-`, `_`, `.` characters can't be used multiple times in a row
     */
    override operator fun invoke(username: String): Boolean = usernameRegex matches username
}

/**
 * Regular expression for username validation.
 */
public val usernameRegex: Regex = Regex("^(?=.{4,32}\$)(?![-_.])(?!.*[-_.]{2})[a-zA-Z\\d-_.]+(?<![-_.])\$")
