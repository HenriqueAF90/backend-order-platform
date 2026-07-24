package henriqueaf90.backend_order_platform

import henriqueaf90.backend_order_platform.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}
