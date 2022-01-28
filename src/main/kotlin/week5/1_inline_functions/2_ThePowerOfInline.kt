package week5.`1_inline_functions`


/*
    Regular non-inlined lambdas
 */

fun myRun(f: () -> Unit) = f()
fun main(){
    val name = "Kotlin"

    // bring performance overhead
    myRun{ println("Hi, $name!") }

    // NO performance overhead
    run{ println("Hi, $name!") }

    // in comparison to:
    println("Hi $name!")
}

/* inline function :
    compiler substitutes a body of the function instead of calling it

    inlining of run

    run{ println("Hi") }   ======= in the bytecode ==> println("Hi")
 */

/*
    withLock function

    val l:Lock = ...
    l.withLock {
        //access the resource protected by this lock
    }
 */

/*
    Java try with resources syntax
    ===> use function
    BufferedReader(FileReader(path)).use{ br -> return br.readLine() }
 */

/*
    No performance overhead when you use
    run, let, takeIf, takeUnless, repeat, withLock, use
 */

/*
    By default, Don't define your functions as inline.
 */


class `2_ThePowerOfInline` {
}