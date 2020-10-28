package com.kointosser.kointosserrest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort

/**
 * This test launches the server on a random port and tests if it is working
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

    @LocalServerPort
    var port: Int = 0

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    @Throws(Exception::class)
    fun greetingShouldReturnDefaultMessage() {
        val url = "http://localhost:$port/toss"
        val responsePattern = "(HEADS)|(TAILS)"
        assertThat(restTemplate.getForObject(url, String::class.java)).matches(responsePattern)
    }
}