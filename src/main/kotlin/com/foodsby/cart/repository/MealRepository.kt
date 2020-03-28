package com.fuchida.cart.repository

import com.fuchida.cart.domain.MealEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MealRepository: JpaRepository<MealEntity, Long> {
}