package henriqueaf90.backend_order_platform

import henriqueaf90.backend_order_platform.entity.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long> {
}