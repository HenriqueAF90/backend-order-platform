package henriqueaf90.backend_order_platform.entity

import jakarta.persistence.*

@Entity
@Table(name = "orders")
class Order(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var customerName: String = "",

    @Column(nullable = false)
    var status: String = ""

)