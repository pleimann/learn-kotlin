package com.pleimann.learningkotlin.kotlin

private fun printAString(value: String) {
    println(value)
}

fun addTwoNumbers(one: Double, two: Double = 3.9) =
    one + two

fun printSomeMath(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}

fun methodTakesALambda(input: String, action: (String) -> Int) {
    println(action(input))
}

fun main(args: Array<String>) {
    printAString(addTwoNumbers(1.3, 100.0).toString())
    printAString(addTwoNumbers(1.3).toString())

    printSomeMath(34.2, 17.1)
    printSomeMath(two=17.1, one=34.2)


}