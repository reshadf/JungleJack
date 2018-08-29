package com.proactive.junglejack.app

import com.proactive.junglejack.app.Model.MozarellaCheese
import com.proactive.junglejack.app.Model.Pizza
import com.proactive.junglejack.app.Model.TomatoSauce
import org.junit.Test

import org.junit.Assert.*

class PizzaUnitTest {

    @Test
    fun basePizza_hasNoCheeseAndTomatoSauce() {
        val pizza: Pizza = Pizza()

        assertNull(pizza.baseSause())
        assertNull(pizza.cheeseType())
    }

    @Test
    fun basePizza_hasNoCheeseAndHasTomatoSauce() {

        val sauce = TomatoSauce()
        val pizza: Pizza = Pizza(sauce = sauce)

        assertNotNull(pizza.baseSause())
        assertNull(pizza.cheeseType())
    }

    @Test
    fun basePizza_hasCheeseAndHasTomatoSauce() {

        val cheese = MozarellaCheese()
        val sauce = TomatoSauce()
        val pizza: Pizza = Pizza(sauce = sauce, cheese = cheese)

        assertNotNull(pizza.baseSause())
        assertNotNull(pizza.cheeseType())
    }

}