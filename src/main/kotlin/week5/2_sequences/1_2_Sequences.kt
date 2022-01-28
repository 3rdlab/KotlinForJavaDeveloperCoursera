package week5.`2_sequences`

/*
    Lambdas are inlined

    but: intermediate collections are created for chained calls
    -> filter, any, etc are always create other Collections everytime

    ===> Another Options : Sequences

   Collections vs Sequences
   ->
   eager vs lazy evaluation

 */


val list = listOf(1, 2, -3)
val maxOddSquare = list
    .asSequence() // Collection to "Sequence"
    .map{it * it}
    .filter{ it % 2 == 1}
    .maxOrNull()

/*
    Collections : Horizontal evaluation
    Sequences : Vertical evaluation

    intermediate collections are created on chained calls
    vs
    lambdas are not inlines
 */

fun m(i: Int): Int {
    print("m$i ")
    return i * i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}

val list1 = listOf(1, 2, 3, 4)

// m1 f1 m2 f2 m3 f3 m4 f4
val result1 = list.asSequence().map(::m).filter(::f).toList()

// f1 f2 m2 f3 f4 m4
val result2 = list.asSequence().filter(::f).map(::m).toList()

class `1_CollectionsVsSequences` {
}