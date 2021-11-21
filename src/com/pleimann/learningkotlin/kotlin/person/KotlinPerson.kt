package com.pleimann.learningkotlin.kotlin.person

import java.util.*

data class KotlinPerson(
    val id: Long,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: Calendar?
){
    var favoriteColor: String? = null

    private fun getLastLetter(a: String) = a.takeLast(1)

    fun getLastLetterOfFavoriteColor(): String {
        return favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    private fun getUpperCaseColor(): String {
        return favoriteColor?.uppercase() ?: ""
    }

    fun getColorType(): String {
        return when (getUpperCaseColor()) {
            "" -> "empty"
            "RED", "BLUE", "GREEN" -> "rgb"
            else -> "other"
        }
    }

    val age: Int?
        get() = getAge(dateOfBirth)

    val safeAge: Int
        get() = age ?: -1

    override fun toString() = "$title $firstName $surname"

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if(dateOfBirth == null) return null

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

            return if(dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.DAY_OF_YEAR)) years - 1 else years
        }
    }
}

fun main() {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977,9,3))
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", null)

    println("${john}'s age is ${john.age}")
    println("${jane}'s age is ${jane.age}")
    println("the age of someone born on 3 May 1998 is ${KotlinPerson.getAge(GregorianCalendar(1988,5,3))}")

    val olderPerson = if (john.safeAge > jane.safeAge) john else jane
    println("The older person is $olderPerson")

    println("$jane's favorite color is ${jane.favoriteColor}")
}
