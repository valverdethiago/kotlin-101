package challenges.topclients

import java.time.Instant
import java.time.temporal.ChronoUnit

class TransactionService {

    fun topClients(transactions: List<Transaction>, limit: Int): Map<Client, Double> {
        val lastThirdDays = Instant.now().minus(30, ChronoUnit.DAYS)
        return transactions.filter { it.timestamp.isAfter(lastThirdDays) }
            .groupBy { it.client }
            .mapValues { (_, transactions) -> transactions.sumOf { it.amount} }
            .toList()
            .sortedByDescending { it.second }
            .take(limit)
        .toMap()
    }
}