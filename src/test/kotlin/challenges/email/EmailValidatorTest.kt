package challenges.email

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EmailValidatorTest {
    @Test
    fun filterValidEmails() {
        val input = listOf(
            "john.doe@example.com",
            "jane_doe@sub.domain.co.uk",
            "invalid-email",
            "missing@domain",
            "   user@domain.com  ",
            "@missingusername.com"
        )

        val expected = listOf(
            "john.doe@example.com",
            "jane_doe@sub.domain.co.uk",
            "user@domain.com"
        )
        assertEquals(expected, EmailValidatorImpl.filterValidEmails(input))
    }
}