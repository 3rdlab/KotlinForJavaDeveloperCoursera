package week4.conventions


/*
    Accessing elements by index : []

    class Board{}
    board[1, 2] = 'x'
    board[1, 2] // x

    operator fun Board.get(x: Int, y: Int): Char {}
    operator fun Board.set(x: Int, y: Int), value:Char){}
 */

/*
    The iterator convention

    operator fun CharSequence.iterator(): CharIterator
    for(c in "abc") {}
 */

/*
    Destructuring declarations

    val (first, second) = pair
    for((key, value) in map) {}
    map.forEach{ (key, value) -> }

 */

/*
    Destructuring declarations & data classes

    data class Contact(
        val name: String,
        val email: String,
        val phoneNumber: String)

     val(name, _, phoneNumber) = contact
 */

class `2_Conventions` {
}