package henriqueaf90.backend_order_platform.entity

import jakarta.persistence.*

@Entity
@Table(name = "products")
class Product(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false)
    var price: Double = 0.0
)
