package com.example.myapp.kotlinexamples

fun main() {
    //strings example
    val numberOfFish = 5
    val numberOfPlants = 12
    /*println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")*/

    //is-else and comparision examples
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
}