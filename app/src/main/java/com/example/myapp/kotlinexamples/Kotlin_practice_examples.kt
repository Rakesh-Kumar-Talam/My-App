package com.example.myapp.kotlinexamples


fun main() {
    //strings example
    /*val numberOfFish = 5
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
    }*/

    //nullability
    /*var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    println(fishFoodTreats)

    var fishFoodTreats1 = 10
    fishFoodTreats1 = fishFoodTreats1?.dec() ?: 0
    println(fishFoodTreats1)*/

    //list
    /*val school = listOf("mackerel", "trout", "halibut")
    println(school)

    //mutablelist
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList.remove("shark"))*/

    //array
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
    //concatinating arrays
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[0])
    println(foo2[5])
}