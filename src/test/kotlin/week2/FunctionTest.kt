package week2

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import week2.basics.Function

internal class FunctionTest{

    private val functionSample: Function = Function()

    @Test
    fun joinToString(){
        val joinTest1 = listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix=")")
        assertThat(joinTest1).isEqualTo("(abc)")

        val joinTest2 = listOf(1, 2, 3).joinToString()
        assertThat(joinTest2).isEqualTo("1, 2, 3")
    }


    @Test
    fun testDisplayMax(){
        functionSample.displayMax(10, 20)
        functionSample.displayMax(50, 20)
    }

    @Test
    fun displaySeparatorTest(){
        // isEqualTo("#####")
        functionSample.displaySeparator('#', 5)

        // isEqualTo("##########")
        functionSample.displaySeparator('#')

        // isEqualTo("**********")
        functionSample.displaySeparator()

        functionSample.displaySeparator(size = 5)
    }
}