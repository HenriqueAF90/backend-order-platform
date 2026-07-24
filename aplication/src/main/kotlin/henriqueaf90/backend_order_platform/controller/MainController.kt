package henriqueaf90.backend_order_platform.controller

import henriqueaf90.backend_order_platform.entity.Order
import henriqueaf90.backend_order_platform.entity.Product
import henriqueaf90.backend_order_platform.service.OrderService
import henriqueaf90.backend_order_platform.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    private val orderService: OrderService,
    private val productService: ProductService
) {

    @GetMapping("/orders")
    fun getOrders(): List<Order> {
        return orderService.getOrders()
    }

    @PostMapping("/orders")
    fun createOrder(
        @RequestBody order: Order
    ): Order {
        return orderService.createOrder(order)
    }

    @GetMapping("/products")
    fun getProducts(): List<Product> {
        return productService.getProducts()
    }

    @PostMapping("/products")
    fun createProduct(
        @RequestBody product: Product
    ): Product {
        return productService.createProduct(product)
    }
}