package week2.controlStructures

import org.jetbrains.annotations.TestOnly

class InChecksAndRanges {

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9' // isNotDigit('x') -> true

    fun recognize(c: Char) = when(c) {
        in '0'..'9' -> "It's digit"
        in 'a'..'z', in 'A'..'Z' -> "It's digit"
        else -> "I don't know"
    }

    /*
        "ab".."az"          -> ClosedRange<String>
        startDate..endDate  -> ClosedRange<MyDate>

        val intRange: IntRange = 1..9
        val anotherIntRange: IntRange = 1 until 10
        val charRange: CharRange = 'a'..'z'
        val stringRange: ClosedRange<String> = "ab".."az"
        val dateRange:ClosedRange<MyDate> = startDate..endDate

        Can compare String like Int in Kotlin
        "ball" in "a".."k" -> "a" <= "ball" && "ball" <= "k"
        "ball" in "a".."k"-> true
     */

}