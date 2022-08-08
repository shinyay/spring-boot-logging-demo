package io.spring.shinyay.loggingdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootLoggingDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringBootLoggingDemoApplication>(*args)
}
