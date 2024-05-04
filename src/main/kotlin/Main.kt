package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Dragon: Monster() {
    override fun frighten(): Boolean {
        println("Fire!!!")
        return true
    }
}
fun main() {
    val m = arrayOf(
        Vampire(),
        Dragon(),
        Monster()
    )
    for (item in m) {
        item.frighten()
    }
}

open class Monster {
    open fun frighten(): Boolean {
        println("Aargh!")
        return false
    }
}

class Vampire: Monster() {
    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return true
    }
}