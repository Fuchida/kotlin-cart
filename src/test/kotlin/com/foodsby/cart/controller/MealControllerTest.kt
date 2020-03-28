package com.fuchida.cart.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fuchida.cart.domain.MealEntity
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MealControllerTest (
        @Autowired val context: WebApplicationContext,
        @Autowired val mapper: ObjectMapper
) {
    private val mvc: MockMvc = (MockMvcBuilders
            .webAppContextSetup(context)
            .build())
    @Test
    fun `GET meals should return the default meal`(){
        val expectedMealItems = "Double_Cheese_Burger"
        val expectedMealTotal = 500

        val response = mvc.get("/default/meal")
                        .andExpect { status {isOk} }
                        .andReturn().response

        val providedMeal = mapper.readValue<MealEntity>(response.contentAsString)

        providedMeal.items shouldBe expectedMealItems
        providedMeal.total shouldBe expectedMealTotal

    }
}