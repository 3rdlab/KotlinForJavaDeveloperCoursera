package week2.basics

class Function {

    fun max(a: Int, b: Int) = if ( a > b ) a else b

    // same as displayMax(a: Int, b: Int) : Unit
    // Unit is void function
    fun displayMax(a: Int, b: Int) {
        println(max(a, b))
    }

    fun displaySeparator(character: Char = '*', size: Int = 10){
        repeat(size) {
            print(character)
        }
    }
    /*
    ** Calling a top-level function from Java
    *
    * -- MyFile.kt
    * @file: JvmName("Util")
    * package intro
    * fun foo() = 0
    *
    * -- UsingFoo.java
    * package other;
    * // import intro.MyFileKt;
    * import intro.Util
    * .....
    * // MyFileKt.foo();
    * Util.foo()
    *
     */
}