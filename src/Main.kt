import animals

fun main() {
    print("Please enter the number of the habitat you would like to view: ")
    val userChoice: String = readln()
    val numHabitat: Int? = userChoice.toIntOrNull()

    if (numHabitat != null) {
        val animal: String = animals[numHabitat]
        println("\n$animal")
    }

    println("See you later!")
}
