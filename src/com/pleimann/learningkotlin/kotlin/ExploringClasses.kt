package com.pleimann.learningkotlin.kotlin

class Customer(
    val name: String,
    val address: String,
    val age: Int
)

class AlternativeCustomer (val name: String, var age: Int){
    var address: String = ""

    constructor(name: String, address: String, age: Int): this(name, age) {
        this.address = address
    }
}

fun main(args: Array<String>) {
    val customer = Customer("Mike", "12 Pennsylvania", 44)

    println("${customer.name} is ${customer.age} years old")
}