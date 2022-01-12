package week3.functionalProgramming

class Lambdas {
    /*
    In Kotlin, lambdas always go with {}

    list.any({i: Int -> i > 0})
    ====>
    list.any(){i:Int -> i > 0}      // if it is the last
    ====>
    list.any{ i -> i > 0 }        // can be omitted () if it is empty
    ====>
    list.any{ it > 0 }

    map.mapValues { entry -> "${entry.key} -> ${entry.value}!" }
    ===>
    map.mapValues { (key, value) -> "$key -> $value!" }
    ===>
    map.mapValues { (_, value) -> "$value!" } // if not used
     */

}