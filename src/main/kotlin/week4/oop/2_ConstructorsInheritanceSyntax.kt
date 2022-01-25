package week4.oop


class A
val a = A() // no new keyword

class Person(val name: String, val age: Int)

// same as
// class Person2(name: String)
class Person2(name: String) {
    val name: String // property declaration
    init {
        this.name = name
    }
}

/*
    Changing visibility of a constructor
 */

class InternalComponent
internal constructor(name: String){

}

/*
    Secondary constructor
 */

class Rectangle(val height: Int, val width: Int){
    constructor(side: Int) : this(side, side){} // secondary constructor, "this" call another constructor
}



/*
    Different syntax for inheritance
 */

interface Base
class BaseImpl: Base

open class Parent
class Child: Parent() // constructor call

open class Parent2(val name: String)
class Child2: Parent2 {
    constructor(name: String, param: Int): super(name) // Calling constructor of the parent class
}


class `2_ConstructorsInheritanceSyntax` {
}