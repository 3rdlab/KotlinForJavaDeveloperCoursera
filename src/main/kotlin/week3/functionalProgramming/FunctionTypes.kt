package week3.functionalProgramming

// can store lambda in variables
val sum = {x: Int, y: Int -> x + y}
val sum2:(Int, Int) -> Int = { x, y -> x + y}

val isEven = {i:Int -> i % 2 == 0 }
val list = listOf(1, 2, 3, 4)

fun main(){
    list.any(isEven)
    list.filter(isEven)

    // Calling lambda directly
    // { println("hey!") }()
    run { println("hey!") }
}

/*
** SAM(single abstract method) interface
*
* public interface Runnable {
*   public abstract void run();
* }
*
*
* What is the difference?
*
* () -> Int? vs (() -> Int)?
*
 */

// val f1: () -> Int? = null        // error
val f2: () -> Int? = { null }
val f3: (() -> Int)? = null
// val f4: (() -> Int)? = { null }  // error

class FunctionTypes {
}