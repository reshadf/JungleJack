package com.proactive.junglejack.app.Model

import com.proactive.junglejack.app.Interface.AnimalInterface


data class Dog(override val name: String): AnimalInterface {

    override fun run(): String {
        return "runs!"
    }

    override fun makeSound(): String {
        return "wafwaf"
    }

    override fun fly(): String {
        return "Dogs don't fly!"
    }
}