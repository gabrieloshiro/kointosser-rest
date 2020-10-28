package com.kointosser.kointosserrest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KoinTosserRestApplicationTest {

    @Autowired
    private lateinit var controller: KoinTosserController

    @Test
    fun contextLoads() {
        assertThat(controller).isNotNull
    }
}
