package challenges.invoice

data class Invoice(val id: String, val client: Client, val lineItems: List<LineItem>) {
    fun totalAmount(): Double = lineItems.sumOf { it.quantity * it.unitPrice }
}
