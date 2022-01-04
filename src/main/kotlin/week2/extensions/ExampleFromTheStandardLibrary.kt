package week2.extensions

class ExampleFromTheStandardLibrary {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    fun main(){
        println(set.javaClass) // analogous to Java's set.getClass()



        //extension function
        // (abc)
        println(listOf('a', 'b').joinToString(separator = "", prefix = "(", postfix = ")"))
    }

    fun anotherMain(args: Array<String>){
        println("Hello, ${args.getOrNull(0)}!")

        // getOrNull()
        val list = listOf("abc")
        println(list.getOrNull(0)) // abc
        println(list.getOrNull(1)) // null


        // withIndex()
        val list2 = listOf("a", "b", "c")
        for((index, elem) in list2.withIndex()){
            println("$index $elem")
        }
    }

    // 1.until(10) Or 1 until 10 with "infix"
    // infix fun Int.until(to: Int): IntRange {}

    // "ANSWER".to(42)
    // "hot" to RED
    // mapOf(0 to "zero)
    infix fun<A, B> A.to(that: B) = Pair(this, that)


    // Extensions on String

    // multiline

    // trimMargin() trimIndent()
    val q = """To code,
        |or not to code?..""".trimMargin(marginPrefix="#")

    val regex = """\d{2}\.\d{2}""".toRegex()

    // "xx".toInt() -> NumberFormatException
    val test1 = "123".toInt()
    val test2 = "123".toIntOrNull()


    fun main3(){
        infix fun <T> T.eq(other: T){
            if(this == other) println("OK")
            else println("Error: $this != $other")
        }

        fun getAnswer() = 42
        println(getAnswer() eq 42)
    }


}