package week5.`2_sequences`

fun fibonacci(): Sequence<Int> = sequence {
    var elements = Pair(0, 1)

    while(true) {
        yield(elements.first)
        elements = Pair(elements.second,
            elements.first + elements.second)
    }
}


fun main(){
    println(fibonacci().take(10).toList())
}

class Playgroud_Fibonacci {
}