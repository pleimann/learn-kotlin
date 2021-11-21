package com.pleimann.learningkotlin.kotlin;

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    var result: Any

    val randomNumber = Random().nextInt(3)

    if(randomNumber == 1) {
        result = BigDecimal(30)

    } else {
        result = "Hello"
    }

    if (result is BigDecimal) {
        result += BigDecimal(17)
    } else {
        result = (result as String).uppercase()
    }

    println(result)
}
