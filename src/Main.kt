import animals

fun main() {
    do {
        print("Please enter the number of the habitat you would like to view: ")
        val userChoice: String = readln()
        val numHabitat: Int? = userChoice.toIntOrNull()

        if (numHabitat != null) {
            val animal: String = animals[numHabitat]
            println("\n$animal")
        }
    } while (numHabitat != null)

    println("See you later!")
}
