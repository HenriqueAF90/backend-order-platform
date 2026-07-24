package henriqueaf90.backend_order_platform.service

import henriqueaf90.backend_order_platform.ProductRepository
import henriqueaf90.backend_order_platform.entity.Product
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
) {
    fun createProduct(product: Product): Product {
        return productRepository.save(product)
    }

    fun getProducts(): List<Product> {
        return productRepository.findAll()
    }
}