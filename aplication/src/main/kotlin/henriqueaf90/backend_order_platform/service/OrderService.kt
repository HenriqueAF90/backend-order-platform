package henriqueaf90.backend_order_platform.service

import henriqueaf90.backend_order_platform.OrderRepository
import henriqueaf90.backend_order_platform.entity.Order
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderRepository: OrderRepository
) {
    fun createOrder(Order: Order): Order {
        return orderRepository.save(Order)
    }
    fun getOrders() : List<Order> {
        return orderRepository.findAll()
    }
}