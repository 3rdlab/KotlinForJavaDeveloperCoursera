package week4.oop


// fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>


//   Non-nullable upper bound
fun <T: Any> foo(list: List<T>){
    for( element in list){} // foo(listOf(1, null)) -> Error
}

// comparable upper bound
fun <T: Comparable<T>> max(first: T, second: T): T {
    return if(first > second) first else second
}

// Multiple constrains for a type parameter

fun <T> ensureTrailingPeriod(seq: T)
    where T: CharSequence, T: Appendable {
        if(!seq.endsWith('.')){
            seq.append('.')
        }
    }




class `7_Generics` {
}