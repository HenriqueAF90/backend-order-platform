package henriqueaf90.backend_order_platform.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InfoController {
        @GetMapping("/status")
        fun getStatus() : Map<String, String> {
            return mapOf (
                "Status"  to "UP",
                "aplication" to "backend Order Platform"
            )
    }
    @GetMapping("/about")
    fun getAbout() : Map<String, String> {
        return mapOf (
            "project" to "Backend Order Plataform",
            "Language" to "Kotlin",
            "Framework" to "Spring Boot",
            "Version" to "1.0.0"
        )



    }
}