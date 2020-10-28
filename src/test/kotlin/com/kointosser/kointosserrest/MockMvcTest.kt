package com.kointosser.kointosserrest

import org.hamcrest.Matchers.matchesPattern
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * On this test the server is not started at all. The test concerns how Spring handles the incoming HTTP request and
 * hands it off to your controller. That way, almost of the full stack is used, and the code will be called in exactly
 * the same way as if it were processing a real HTTP request but without the cost of starting the server. To do that,
 * use Spring’s MockMvc and ask for that to be injected for you by using the @AutoConfigureMockMvc annotation on the
 * test case.
 */
@SpringBootTest
@AutoConfigureMockMvc
class MockMvcTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    @Throws(java.lang.Exception::class)
    fun shouldReturnDefaultMessage() {
        val resultPattern = "(\"HEADS\")|(\"TAILS\")"
        mockMvc.perform(get("/toss"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful)
                .andExpect(content().string(matchesPattern(resultPattern)))
    }
}