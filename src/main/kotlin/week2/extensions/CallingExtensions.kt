package week2.extensions

class CallingExtensions {

    // Extensions to Child & Parent

    open class Parent
    class Child : Parent()

    fun Parent.foo() = "parent"
    fun Child.foo() = "child"

    fun main(args: Array<String>){
        val parent: Parent = Child()
        println(parent.foo()) // "parent"

        // Extensions are static java functions under the hood
        // No override for extension function in Kotlin
    }



    class A {
        // Extensions don't hide members
        fun foo() = 1
        // Extensions can overload members
        fun foo2() = "member"
    }

    fun A.foo() = 2 // Warning : ignored. A.foo() = 1
    fun A.foo(i: Int) = "extension($i)" // A().foo(2) -> extension(2)

}