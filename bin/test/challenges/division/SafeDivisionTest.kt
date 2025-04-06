package challenges.division

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class SafeDivisionTest {
    @Test
    fun testValidArguments() {
        assertEquals(2, SafeDivision().divide(10, 5))
    }

    @Test
    fun testNullDivisor() {
        assertThrows<IllegalArgumentException>("") { SafeDivision().divide(10, null) }
    }
}