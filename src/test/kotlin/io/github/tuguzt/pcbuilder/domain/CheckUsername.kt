package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.usecase.CheckUsernameUseCase
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Set of tests for [CheckUsernameUseCase].
 */
class CheckUsername {
    @Test
    fun `simple username`() {
        val checkUsername = CheckUsernameUseCase()

        assertTrue { checkUsername("tuguzT") }
        assertFalse { checkUsername("") }
        assertTrue { checkUsername("lower_snake_case") }
        assertTrue { checkUsername("SCREAMING_SNAKE_CASE") }
    }

    @Test
    fun `username with special characters`() {
        val checkUsername = CheckUsernameUseCase()

        assertTrue { checkUsername("tugushev_timur_q") }
        assertTrue { checkUsername("any-harmony") }
        assertTrue { checkUsername("thirty.two.characters.supported") }
    }

    @Test
    fun `username with start or end special characters`() {
        val checkUsername = CheckUsernameUseCase()

        assertFalse { checkUsername("_tugushev_timur") }
        assertFalse { checkUsername("tugushev_timur_") }
        assertFalse { checkUsername(".some.username") }
        assertFalse { checkUsername("another-username-") }
    }

    @Test
    fun `username with special characters in row`() {
        val checkUsername = CheckUsernameUseCase()

        assertFalse { checkUsername("tugushev__timur") }
        assertFalse { checkUsername("Tugushev._Timur") }
        assertFalse { checkUsername("some--username") }
        assertFalse { checkUsername("another..username") }
    }

    @Test
    fun `check username length`() {
        val checkUsername = CheckUsernameUseCase()

        assertTrue { checkUsername("tuguzT") }
        assertFalse { checkUsername("tug") }
        assertFalse { checkUsername("too-many-characters-in-one-single-username-why") }
    }
}
