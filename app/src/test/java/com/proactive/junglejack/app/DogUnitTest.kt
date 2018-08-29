package com.proactive.junglejack.app

import com.proactive.junglejack.app.Interface.AnimalInterface
import com.proactive.junglejack.app.Model.Dog
import org.junit.Assert.assertEquals
import org.junit.Test

class DogUnitTest {

    @Test
    fun catsName_isCorrect() {

        val animal: AnimalInterface = Dog("Daan")
        val expected = "Daan"

        assertEquals(expected, animal.name)
    }

    @Test
    fun catsNoise_isCorrect() {

        val animal: AnimalInterface = Dog("Jesse")
        val expected = "wafwaf"

        assertEquals(expected, animal.makeSound())
    }

    @Test
    fun cats_canNotFly() {

        val animal: AnimalInterface = Dog("Daan")
        val expected = "Dogs don't fly!"
        assertEquals(expected, animal.fly())
    }
}