package io.spring.shinyay.loggingdemo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootLoggingDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringBootLoggingDemoApplication>(*args)
}

val Any.logger: Logger
    get() = LoggerFactory.getLogger(this::class.java)
