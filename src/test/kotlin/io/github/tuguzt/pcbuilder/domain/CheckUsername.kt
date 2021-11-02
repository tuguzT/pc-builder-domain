package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.interactor.checkUsername
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Set of tests for [checkUsername] function.
 */
class CheckUsername {
    @Test
    fun `simple username`() {
        assertTrue { checkUsername("tuguzT") }
        assertFalse { checkUsername("") }
        assertTrue { checkUsername("lower_snake_case") }
        assertTrue { checkUsername("SCREAMING_SNAKE_CASE") }
    }

    @Test
    fun `username with special characters`() {
        assertTrue { checkUsername("tugushev_timur_q") }
        assertTrue { checkUsername("any-harmony") }
        assertTrue { checkUsername("thirty.two.characters.supported") }
    }

    @Test
    fun `username with start or end special characters`() {
        assertFalse { checkUsername("_tugushev_timur") }
        assertFalse { checkUsername("tugushev_timur_") }
        assertFalse { checkUsername(".some.username") }
        assertFalse { checkUsername("another-username-") }
    }

    @Test
    fun `username with special characters in row`() {
        assertFalse { checkUsername("tugushev__timur") }
        assertFalse { checkUsername("Tugushev._Timur") }
        assertFalse { checkUsername("some--username") }
        assertFalse { checkUsername("another..username") }
    }

    @Test
    fun `check username length`() {
        assertTrue { checkUsername("tuguzT") }
        assertFalse { checkUsername("tug") }
        assertFalse { checkUsername("too-many-characters-in-one-single-username-why") }
    }
}
