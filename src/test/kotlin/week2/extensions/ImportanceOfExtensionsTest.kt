package week2.extensions

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ImportanceOfExtensionsTest{

    @Test
    fun test(){
        val a = "ABCD"
        val b = "ACDE"

        println(a.count{c ->  c == 'A'})
    }

}