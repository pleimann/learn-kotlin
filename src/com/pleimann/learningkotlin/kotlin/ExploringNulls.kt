package com.pleimann.learningkotlin.kotlin

fun main(args: Array<String>) {
    var name: String? = null

    println(name?.uppercase())
    println(name!!.uppercase())

    name = "Mike"

    println(name?.uppercase())
}