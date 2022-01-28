package week5.`3_LambdaWithReceiver`

/*
    Extension Function & Lambdas
    ===>
    Lambda with receiver
 */

fun main(){

    val sb = StringBuilder()
    sb.appendLine("Alphabet: ")
    for(c in 'a'..'z') {
        sb.append(c)
    }
    sb.toString()
    // ===

    // with is a function
    with(sb){
        appendLine("Alphabet")
        for(c in 'a'..'z') {  append(c)  }
        toString()
    }

    with(sb) { ->
        this.appendLine("Alphabet")
        for (c in 'a'..'z') {
            this.append(c)
        }
        this.toString()
    }

    val isEven:(Int) -> Boolean = { it % 2 == 0}    // store lambda in variable
    val isOdd: Int.() -> Boolean = {this % 2 == 1}  // lambda with receiver

    isEven(0)   // calling as regular function
    1.isOdd()   // calling as extension function


    /*
        buildString
     */
    val s: String = buildString{
        appendLine("Alphabet: ")
        for(c in 'a'..'z'){
            append(c)
        }
    }

}

/*
    Gradle Build Script in Kotlin

    plugins {
        application
        kotlin("jvm") version "1.5"
    }
 */


class `1_LambdaWithReceiver` {
}