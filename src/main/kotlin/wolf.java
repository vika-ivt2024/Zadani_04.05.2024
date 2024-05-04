class wolf : canine() {
    override val image: String = "wolf.jpg"
    override val food: String = "meat"
    override val habitat: String = "forests"

    override fun makeNoise () {
        println("Hooooow!")
    }
    override fun eat() {
        println("Wolf ect $food")
    }
}
