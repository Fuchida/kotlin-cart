package com.fuchida.cart.service

import com.fuchida.cart.domain.MealEntity

interface MealService {
    fun getMeal(): MealEntity
    fun addMeal(meal: MealEntity): MealEntity
}