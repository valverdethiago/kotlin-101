package challenges.topclients

import java.time.Instant


data class Transaction(val client: Client, val amount: Double, val timestamp: Instant)
