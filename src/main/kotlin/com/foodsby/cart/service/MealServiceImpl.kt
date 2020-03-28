package com.fuchida.cart.service

import com.fuchida.cart.domain.MealEntity
import com.fuchida.cart.repository.MealRepository
import org.springframework.stereotype.Service

@Service
class MealServiceImpl (private val mealRepository: MealRepository): MealService {
    override fun getMeal() = MealEntity(1, 1, 11,
            "Double_Cheese_Burger", 500)

    override fun addMeal(meal: MealEntity): MealEntity {
        return mealRepository.save(meal)
    }
}
