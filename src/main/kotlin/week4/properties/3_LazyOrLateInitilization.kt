package week4.properties


/*
    Lazy property
 */

val lazyValue: String by lazy {
    println("computed")
    "Hello"
}

fun main(){
    println(lazyValue)
    println(lazyValue)
}

/*
    Late initilization

    // can't be val
    // MyData can't be nullable and primitive type

    lateinit var myData: MyData

    class MyClass {
        lateinit var lateinitVar: String

        fun initilizationLogic(){
            println(this::lateinitVar.isInitilized) // false
            lateinitVar = "value"
            println(this::lateinitVar.isInitilized) // true
        }

    }
 */

class `3_LazyOrLateInitilization` {
}