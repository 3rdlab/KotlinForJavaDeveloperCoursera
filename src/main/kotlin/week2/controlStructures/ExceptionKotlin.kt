package week2.controlStructures

import java.io.IOException

class ExceptionKotlin {

    // no difference between checked and unchecked exceptions

    fun throwExample(number: Int, numberString: String) {
        val percentage = if (number in 0..100) number
        else throw IllegalArgumentException("between 0 and 100 : $number")

        val number2 = try {
            Integer.parseInt(numberString)
        } catch (e: NumberFormatException) {
            return
        }
    }

    // compile.
    // without @Thorws annotation, will not compile
    // if you will use this on Java code, need the annotation
    @Throws(IOException::class)
    fun foo(){
        throw IOException()
    }

}