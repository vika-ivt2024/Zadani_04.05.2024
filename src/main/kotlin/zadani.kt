package org.example

abstract class Appliance {
    var pluggedIn = true
    abstract val color: String
    abstract fun consumPower()
}
class CoffeeMaker : Appliance() {
    override val color = ""
    var coffeeLeft = false
    override fun consumPower(){
        println("Consuming power")
    }
    fun fillWithWater() {
        println("Fill with water")
    }
    fun makeCoffee() {
        println("Make the coffee")
    }
}