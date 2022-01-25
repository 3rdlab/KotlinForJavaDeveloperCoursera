package week4.conventions

/*
    Arithmetic operations

    a + b    ---->   a.plus(b)

    "operator" keyword : plus as an operator
    operators
        plus, minus, times, div, mod,
 */

operator fun Point.plus(other: Point): Point {
    // return Point(x + other.x, y + other.y)
    return Point(1, 1)
}

val testPoint = Point(1, 2) + Point(2, 4)


/*
    No restrictions on parameter type

    operator fun Point.times(scale: Int): Point {
        return Point(x * scale, y * scale
    }

    Point(1, 2) * 3
 */


/*
    Unary operations : function without arguments

    +a : unaryPlus
    -a ; unaryMinus
    !a : not
    ++a, a++ : inc
    --a, a-- : dec
 */

/*
    Assignment operations

    a += b : a = a.plus(b)
    a += b : a = a.plusAssign(b)

 */


class Point(x: Int, y: Int)

class OperatorOverloading {
}