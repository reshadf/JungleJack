package com.proactive.junglejack.app.Interface


interface AnimalInterface {

    val name: String

    fun makeSound(): String
    fun fly(): String
    fun run(): String
}