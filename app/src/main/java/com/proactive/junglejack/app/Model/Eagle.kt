package com.proactive.junglejack.app.Model

import com.proactive.junglejack.app.Interface.AnimalInterface


data class Eagle(override val name: String): AnimalInterface {

    override fun run(): String {
        return "Eagles can't run!"
    }

    override fun makeSound(): String {
        return "tjirptjirp"
    }

    override fun fly(): String {
        return "flying!"
    }
}