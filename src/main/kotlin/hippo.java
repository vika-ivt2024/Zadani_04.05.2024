public class hippo : animal(){
    override val image: String = "hippo.jpg"
    override val food: String = "grass"
    override val habitat: String = "water"

    override fun makeNoise() {
        println("Grunt grunt!")
    }
        override fun eat() {
            println("Hippо ест $food")
    }


}
