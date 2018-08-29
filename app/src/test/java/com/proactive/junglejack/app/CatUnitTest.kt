package com.proactive.junglejack.app

import com.proactive.junglejack.app.Interface.AnimalInterface
import com.proactive.junglejack.app.Model.Cat
import org.junit.Test

import org.junit.Assert.*

class CatUnitTest {

    @Test
    fun catsName_isCorrect() {

        val animal: AnimalInterface = Cat("Jesse")
        val expected = "Jesse"

        assertEquals(expected, animal.name)
    }

    @Test
    fun catsNoise_isCorrect() {

        val animal: AnimalInterface = Cat("Jesse")
        val expected = "miauw"

        assertEquals(expected, animal.makeSound())
    }

    @Test
    fun cats_canNotFly() {

        val animal: AnimalInterface = Cat("Jesse")
        val expected = "Cat's don't fly!"
        assertEquals(expected, animal.fly())
    }

    @Test
    fun cats_canRun() {

        val animal: AnimalInterface = Cat("Jesse")
        val expected = "runs!"
        assertEquals(expected, animal.run())
    }
}
