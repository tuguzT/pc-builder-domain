package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.interactor.checkPassword
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Set of tests for [checkPassword] function.
 */
class CheckPassword {
    @Test
    fun `secure password`() {
        assertTrue { checkPassword("!urs.x^62_O6]BO$") }
        assertTrue { checkPassword("""c+w1<3"jHdV>4q6%=C=%""") }
        assertTrue { checkPassword("""b<0d,W)Lwp.x-j]cE/E-Q5C'Va7&)#Vq"@:{f.uoDRtS|m[e=b""") }
    }

    @Test
    fun `weak password`() {
        assertFalse { checkPassword("12345") }
        assertFalse { checkPassword("admin") }
        assertFalse { checkPassword("1iy1v76f75") }
        assertFalse { checkPassword("strong-password") }
    }

    @Test
    fun `too short password`() {
        assertFalse { checkPassword("h_w91Hj") }
        assertFalse { checkPassword("nya") }
    }
}
