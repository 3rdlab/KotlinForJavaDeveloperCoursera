package week4.properties

class Properties {

/*
    property = field + accessor(s)
    val = field + getter
    var = field + getter + setter

    no getter or setter in kotlin
    access directly :
        ex: contact.address
            contact.address = "..."

 */

}


class Rectangle(val height: Int, val width: Int){

    /* getter without property */
    val isSquare: Boolean
        get() {
            return height == width
        }

    val foo1 = run {
        println("foo1")
        42
    }

    val foo2: Int
        get() {
            println("foo2")
            return 42
        }
}

fun main(){
    val rectangle = Rectangle(5, 5)

    // property only call once
    rectangle.foo1
    rectangle.foo1

    rectangle.foo2
    rectangle.foo2
}


/* access field only inside accessors */
class StateLogger {
    var state = false
        set(value) {
            println("state has changed: $field -> $value")
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        /* Changing visibility of a setter */
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}
