package io.spring.shinyay.loggingdemo.controller

import io.spring.shinyay.loggingdemo.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class DemoController {

    @GetMapping("/hello")
    fun hello(): String {
        logger.info("Hello from Info")
        logger.trace("Hi from Trace")
        logger.error("Hey from Error")
        logger.warn("Ho from Warning")
        return "Hello Spring Boot"
    }
}
