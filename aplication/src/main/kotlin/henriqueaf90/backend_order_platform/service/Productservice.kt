package henriqueaf90.backend_order_platform.service

import henriqueaf90.backend_order_platform.entity.Product
import org.springframework.stereotype.Service

@Service
class Productservice {
    fun getProducts(): Product{
        return  Product(
            id = 1,
            name = "Computer",
            price = 99.99
        )
    }
}