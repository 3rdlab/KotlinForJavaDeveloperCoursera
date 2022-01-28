package week5.`2_sequences`

import kotlin.random.Random
import kotlin.random.nextInt

/*
    Extensions on sequences match
    extensions on collections

    Intermediate operations ( return another Sequence<T> )
    - filter, map

    Terminal operations ( return primitive value such as Boolean, T?)
    - any, find..
 */

// Generating a sequence
val seq = generateSequence {
    Random.nextInt(5).takeIf{ it > 0 }
}

val input = generateSequence {
    readLine().takeIf{ it != "exit"}
}

// Generate an infinite sequence
val numbers = generateSequence(0) { it + 1}


/*
    yield

    yield is not built in language
    it's a regular library function in Kotlin

    it allows you to yield elements in a custom way.

    sequence {
        yield(value)
        doSomething() // any intermediate computations between
        yieldAll(list)
        doSomething()
        yieldAll(sequence)
        doSomething()
    }
 */

val numbers1 = sequence {
    var x = 0
    while (true) {
        yield(x++)
    }
}

fun main(){
    println(seq.toList())
    println(input)
    println(numbers.take(5).toList())

    numbers1.take(5).toList() // [0, 1, 2, 3, 4]
}

class `3_Creating Sequences`