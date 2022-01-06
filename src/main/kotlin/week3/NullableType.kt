package week3

class NullableType {

    val s1: String = "always not null"
    val s2: String? = null // ? nullable
    // val s3: String = null -> compile error

    var s4: String? = "null or not null"
    // s4.length -> X

    /*

    val s: String?
    val length = if (s != null) s.length else null
    =======> safe access
    val length = s?.length == val length:Int? = s?.length
    =======> nullability operators : Elvis Operator. ?:
    val length: Int = s?.length ?: 0

    * Null Assertion
    foo!!
    if( foo != null ) foo else NPE

    val s: String?
    s!!.length

    person.company!!.address!!.country (X)
    =======>
    prefer using safe operators ?. ?: if-checks
    Use not null assertion only with care
     */

    //Nullable Type Under The Hood

    // @Nullable @NotNull annotations
    // no performance overhead
    // Optional -> additional Object created : performance overhead
    fun foo(list1: List<Int?>, list2: List<Int>?){
        list1.size
        list2?.size

        val i: Int? = list1.get(0)
        val j: Int? = list2?.get(0)
    }

}