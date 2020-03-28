package com.fuchida.cart.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "meal")
data class MealEntity (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Long=-1,
        val location_id: Int =1,
        val store_id: Int = 1,
        val items: String= "Double Cheese Burger",
        val total: Int = 500
)