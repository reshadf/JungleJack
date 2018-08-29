package com.proactive.junglejack.app.Model

import com.proactive.junglejack.app.Interface.AnimalInterface


data class Cat(override val name: String): AnimalInterface {

    override fun run(): String {
        return "runs!"
    }

    override fun makeSound(): String {
        return "miauw"
    }

    override fun fly(): String {
        return "Cat's don't fly!"
    }
}