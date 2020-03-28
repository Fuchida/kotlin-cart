package com.fuchida.cart.controller

import com.fuchida.cart.domain.MealEntity
import com.fuchida.cart.service.MealService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
class MealController(private val mealService: MealService){
    @GetMapping("/default/meal")
    @ResponseStatus(HttpStatus.OK)
    fun getMeals() = mealService.getMeal()

    @PostMapping("/meal")
    @ResponseStatus(HttpStatus.CREATED)
    fun addMeal(@RequestBody meal: MealEntity) = mealService.addMeal(meal)
}