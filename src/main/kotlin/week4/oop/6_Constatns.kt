package week4.oop

/*
    const - for primitive types and String
    @JvmField - eliminated accessors
 */

// compile-time constants
// only for primitive and String
const val answer = 42


@JvmField
val prop = MyClass()
/*
    the same as Java (no getter!)
    public static final MyClass p rop = new MyClass();
 */


object A5 {
    @JvmField
    val prop = MyClass() // static field generated
}

class B5 {
    @JvmField
    val prop = MyClass() // regular field generated
}

object SuperComputer {
    @JvmStatic
    val answer = 42 // JAVA : SuperComputer.getAnswer() -> field isn't exposed
}

object SuperComputer2 {
    @JvmField
    val answer = 42 // JAVA : SuperComputer.answer
}


class MyClass{}

class `6_Constatns` {
}