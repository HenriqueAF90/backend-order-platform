package henriqueaf90.backend_order_platform.controller

import henriqueaf90.backend_order_platform.entity.Order
import henriqueaf90.backend_order_platform.entity.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping("/orders")
    fun order(): Order {
        return Order(
            id = 1,
            customerName = "João",
            status = "OK"
        )
    }

    @GetMapping("/products")
    fun products(): Product {
        return Product(
            id = 1,
            name = "Computer",
            price = 99.99
        )
    }
}