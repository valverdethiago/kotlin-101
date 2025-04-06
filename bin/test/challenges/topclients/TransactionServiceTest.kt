package challenges.topclients

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.Instant

class TransactionServiceTest {
    private val service = TransactionService()

    companion object {
        private val EMPTY_TRANSACTIONS = emptyList<Transaction>()
        private val CLIENT_A = Client("A", "Client A")
        private val CLIENT_B = Client("B", "Client B")
        private val CLIENT_C = Client("C", "Client C")
        private val CLIENT_D = Client("D", "Client D")
        private val CLIENT_E = Client("E", "Client E")
        private val DEFAULT_TRANSACTIONS = listOf(
            Transaction(CLIENT_A, 100.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_A, 200.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_A, 1000.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_A, 2000.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_B, 50.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_B, 10.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_B, 100000.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_C, 350000.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_D, 100.0, randomTransactionTimestamp(30)),
            Transaction(CLIENT_E, 100.0, randomTransactionTimestamp(30))
        )

        private fun randomTransactionTimestamp(days: Long): Instant =
            Instant.now()
                .minusSeconds(java.util.concurrent.ThreadLocalRandom.current().nextLong(0, days * 24 * 60 * 60))
    }

    @Test
    fun shouldReturnEmptyListIfNoTransactions() {
        assertEquals(0, service.topClients(EMPTY_TRANSACTIONS, 10).size)
    }

    @Test
    fun shouldReturnTopClients() {
        val result = service.topClients(DEFAULT_TRANSACTIONS, 3)
        assertEquals(3, result.size)
        val clients = result.keys.toList()
        assertIterableEquals(listOf(CLIENT_C, CLIENT_B, CLIENT_A), clients)
    }


}