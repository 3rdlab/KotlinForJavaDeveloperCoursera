package week2.controlStructures

import week2.controlStructures.IfAndWhen.Color.*

class IfAndWhen {

    enum class Color{
        BLUE, ORANGE, RED, YELLOW, GREEN
    }

    fun getDescription(color: Color): String = when (color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
        else -> "unknown"
    }


    fun respondToInput(input: String) = when( input ) {
        // check several values at once
        "y", "yes" -> "I'm glad"
        "n", "no" -> "Sorry"
        else -> "I don't understand"
    }

    fun mix(c1 : Color, c2: Color) = when( setOf(c1, c2) ) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        else -> throw Exception("Dirty color")
    }

    /*
      "Pet" is superclass of "Cat" and "Dog" classes
      is === instanceof
      when(pet){
        is Cat -> pet.meow()
        is Dog -> pet.woof()
      }

     * starting from Kotlin 1.3
     * using val keyword inside when
     when( val pet = getMyFavoritePet()){
        is Cat -> pet.meow()
        is Dog -> pet.woof()
     }
     */

    fun updateWeather(degrees: Int){
        val(description, colour) = when { // no argument when
            degrees < 5 -> "cold" to BLUE // description = "cold", colour = BLUE
            degrees < 23 -> "mile" to ORANGE
            else -> "hot" to RED
        }
    }
}