package henriqueaf90.backend_order_platform.entity

data class Order(
    val id: Long,
    val customerName: String,
    val status: String
)
