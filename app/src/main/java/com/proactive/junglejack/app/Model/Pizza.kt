package com.proactive.junglejack.app.Model


class Pizza {

    // base toppings
    private var sauce: TomatoSauce? = null
    private var cheese: MozarellaCheese? = null

    // optional toppings
    private var onion: Onion? = null
    private var mushroom: Mushroom? = null

    constructor(sauce: TomatoSauce? = null, cheese: MozarellaCheese? = null) {
        this.sauce = sauce
        this.cheese = cheese
    }

    fun addOnionTopping(topping: Onion) {
        this.onion = topping
    }

    fun addMushrooms(topping: Mushroom) {
        this.mushroom = topping
    }

    fun baseSause(): TomatoSauce? {
        return this.sauce
    }

    fun cheeseType(): MozarellaCheese? {
        return this.cheese
    }

}