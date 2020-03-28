package com.fuchida.cart.service

import com.fuchida.cart.domain.MealEntity
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MealServiceTest(
        @Autowired val mealService: MealService
) {

    @Test
    fun `GET meals should return available meals`(){
        val expectedMeal = MealEntity(1, 11, 55, "Double_Cheese_Burger", 100)
        mealService.getMeal().items shouldBe expectedMeal.items

    }
}