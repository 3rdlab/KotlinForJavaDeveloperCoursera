package week2.extensions

class ExtensionFunctions {

    // String : receiver. "this" can omit
    private fun String.lastChar() = this.get(this.length - 1)
    private fun String.anotherLastChar() = get(length - 1)

    val c: Char = "abc".lastChar()

    /*
        when call from JAVA file, call it without specification (static)

        import static StringExtentionsKt.lastChar
        charc = lastChar("abc")

        fun String.repeat(n: Int): String {..}
        JAVA Code ->
        StringUtilKt.repeat("ab", 3);
    */

}