/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList")
    println()

    // Create our list
    val snacks = mutableListOf<String>()

    // Show it
    println(snacks)

    // Add in some things
    snacks.add("Moro Gold")
    snacks.add("Pringuls")
    snacks.add("CottenCandy")
    snacks.add("Beer")

    println(snacks)

    // Show specific items
    println(snacks[0])
    //println(snack[3]) This would be out of bounds!

    // Change a value
    snacks[1] = "Slurpfish"
    println(snacks)

    // Remove an item
    snacks.removeAt(0)
    println(snacks)

    // Add in new item in specific places
    snacks.add(1, "Chips")
    println(snacks)

    // Sort the list
    snacks.sort()
    println(snacks)

    // Shuffle the list (randomise it)
    snacks.shuffle()
    println(snacks)

    // Get a random item from list
    val item = snacks.random()
    println(item)

    // Searching for an item
    println("Beer is in the list: ${ snacks.contains("Beer") }")
    println("")

    // Getting index of an item
    println("Beer index: ${snacks.indexOf("Beer") }")

    // Loop through the list
    for (snack in snacks) {
        println(snack)
    }

    // Loop using index
    for(i in 0..< snacks.size){
        println("$i: ${snacks[i] }")
    }

    // Loop getting index and values
    for ((i, snack) in snacks.withIndex()){
        println("$i: $snack")
    }

}

