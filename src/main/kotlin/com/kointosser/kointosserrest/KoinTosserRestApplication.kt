package com.kointosser.kointosserrest

import com.kointosser.kointosser.KoinTosser
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

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
