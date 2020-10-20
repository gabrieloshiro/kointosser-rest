package com.kointosser.kointosserrest

import com.kointosser.kointosser.Coin
import com.kointosser.kointosser.KoinTosser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KoinTosserController(@Autowired
                           private val koinTosser: KoinTosser) {

    @GetMapping("/toss")
    fun toss(): Coin {
        return koinTosser.toss()
    }
}