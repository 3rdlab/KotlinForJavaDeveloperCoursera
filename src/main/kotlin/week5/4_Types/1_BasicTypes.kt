package week5.`4_Types`

/*
    shift shift -> show kotlin bytecode

    No premitive type on Kotlin
    but

 */


fun foo(): Int = 1 // int
/*
    Decompiled
    public static final int foo() {
          return 1;
       }
 */

fun foo1():Int? = 1 // Integer
/*
   @Nullable
   public static final Integer foo1() {
      return 1;
   }

 */


/*
    Kotlin -> Java

    Array<Int> -> Integer[]
    IntArray -> int[]

    Any -> java.lang.Object

    () -> Boolean ===> Function0<Boolean>
    (Order) -> Int ====> Function1<Order, Int>
    (Int, Int) -> Int ===> Function2<Int, Int, Int>

 */

fun main(){
    val ints1 = intArrayOf(1, 2)
    val ints2 = intArrayOf(1, 2)
    println(ints1 == ints2)                 // false
    println(ints1.contentEquals(ints2))     // true (similar with Arrays.equals in java)

    // Prefer Lists to Arrays

}


class `1_BasicTypes` {
}