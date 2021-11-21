package com.pleimann.learningkotlin.kotlin

fun main(args: Array<String>) {
    val myDouble = 34.56f

    var name = "Mike"
    val surname = "Pleimann"

    name = "Asher"

    println("Hello ${name} ${surname}")
    println("Your first name has ${name.length} characters")

    val story = """It was a dark and stormy night
        |a foul smell emanated from ${name}'s ass
    """.trimMargin()

    println(story.uppercase())
}