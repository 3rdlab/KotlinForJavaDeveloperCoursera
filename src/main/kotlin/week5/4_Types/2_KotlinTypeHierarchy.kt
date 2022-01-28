package week5.`4_Types`

/*
     Unit vs Nothing vs void(Java) ?

    "Unit" instead of void
        - No meaningful value is returned
        - a type that allows only one value

     "Nothing" means "never return" -> a type that has no values
        - TODO is inline function
 */

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun report(){
    println("Alles ist gut")
    return Unit // redundant
}

/*
    nullable Nothing(Nothing?) = null on Compiler
 */

fun main(){
    class User(var name: String){}

    var user1 = null
    // user = User("svtk")

    var user2:User? = null
    user2 = User("svtk")

}

class `2_KotlinTypeHierarchy` {
}