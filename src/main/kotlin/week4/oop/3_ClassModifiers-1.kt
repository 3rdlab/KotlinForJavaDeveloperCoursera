package week4.oop

class `3_ClassModifiers-1` {
}

/*
    enum class
 */
enum class Color{ BLUE, ORANGE, RED }

/*
    enum class with properties
 */

enum class Color2(
    val r: Int, val g: Int, val b: Int){
    BLUE(0, 0, 225), ORANGE(255, 165, 0), RED(255, 0, 0);

    fun reg() = (r * 256 + g) * 256 + b
}

/*
    data modifier

    Generates
    equals, hashCode, copy, toString and some others
 */

data class Contact(val name: String, val address: String)

val contact = Contact("name", "seoul")
val copied = contact.copy(address = "busan")

/*
    == : calls equals
    === : checks reference equality
 */

val set1 = setOf(1, 2, 3)
val set2 = setOf(1, 2, 3)

val compare1 = set1 == set2 // true
val compare2 = set1 === set2 // false

/*
    Properties in primary constructor

    data class User(val email: String){
        var nickname: String? = null
    }

    val user1 = User("voldemort@gmail.com")
    user1.nickname = "Voldmort"

    val user2 = User("voldemort@gmail.com")
    user2.nickname = "who"

    user1 == user2 // true
 */



