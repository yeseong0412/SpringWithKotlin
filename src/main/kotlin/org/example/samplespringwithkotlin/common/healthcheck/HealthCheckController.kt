package org.example.samplespringwithkotlin.common.healthcheck

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/health")
@RestController
class HealthCheckController {

    @GetMapping()
    fun healthCheck() : String{
        return "Running"
    }
}