import animals

fun main() {
    print("Please enter the number of the habitat you would like to view: ")
    val numHabitat: Int = readln().toInt()

    val animal: String = animals[numHabitat]
    println("\n$animal")
}
