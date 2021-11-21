package com.pleimann.learningkotlin.kotlin

import com.pleimann.learningkotlin.kotlin.person.KotlinPerson

fun main(args: Array<String>) {
    var x: Int = 0

    while (x < 0) {
        println(x++)
    }

    val people = HashMap<Int, KotlinPerson>()
    people.put(1, KotlinPerson(1, "Mr", "James", "Apple", null))
    people.put(2, KotlinPerson(2, "Miss", "Sophie", "Orange", null))
    people.put(3, KotlinPerson(3, "Mrs", "Anita", "Kumquat", null))
    people.put(4, KotlinPerson(4, "Mr", "Darren", "Banana", null))

    for ((key, value) in people) {
        println("${value.title} ${value.firstName} has key $key")
    }

    for (i in 0..9) {
        print(i)
    }

    println()

    val printIt = { it: Any -> print(it) }

    (0..9).forEach(printIt)
    (9 downTo 0).forEach(printIt)
    (0 until 9).forEach(printIt)
    (0..9 step 2).forEach { println(it) }
    ('A'..'F').forEach { println(it) }
}