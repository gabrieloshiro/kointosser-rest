package com.kointosser.kointosserrest

import com.kointosser.kointosser.KoinTosser
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KoinTosserRestApplication {

    @Bean
    fun koinTosser(): KoinTosser {
        return KoinTosser()
    }
}

fun main(args: Array<String>) {
    runApplication<KoinTosserRestApplication>(*args)
}
