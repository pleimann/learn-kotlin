package com.pleimann.learningkotlin.kotlin

fun main() {
    val colors = listOf("Red", "Green", "Blue")
    println(colors::class.qualifiedName)

    val days = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday")
    println(days::class.qualifiedName)

    val months = setOf("January", "February")
    println(months::class.qualifiedName)

    val colorsIndex = mapOf(
        "red" to "#ff0000",
        "blue" to "#00ff00"
    )
    colorsIndex.forEach { println("${it.key}: ${it.value}") }
}