package week2.basics

class Arguments {

    // can make 8 cases
    fun sumKotlin(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

    // only 4 cases
    // (a,b,c), (a, b), (a), ()
    @JvmOverloads
    fun sumJvmOverloads(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

}