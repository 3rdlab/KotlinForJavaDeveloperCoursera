package week4.oop


/*
    object = singleton
 */

object KSingleton {
    fun foo() {}
}

/*
    object expression
    -> replace java's anonymous classes

    window.addMouseListener(
      object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
          // ...
        }
        override fun mouseEntered(e: MouseEvent) {
          // ...
        }
      }
    )

 */

/*
    A new instance of object expression is created for each call

    fun registerTestRepository(customers: Map<Int, Customer>) {
        registerRepository(object: Repository {
            override fun getById(id: Int): Customer? {
                return customers[id]
            }
        })
    }
 */

/*
    companion object
 */

class B {
    companion object  {
        fun foo() = 1
    }
}

fun main(){
    B.foo()
}

/*
    No "static" keyword in Kotlin
    Why companion object is better than "static"

    - can implement an interface
    - can be a receiver of extension function
 */

class C {
    companion object {
        @JvmStatic fun foo() {} // call static foo from java
        fun bar() {}
    }
}



class `5_ObjectsObjectExpressionsAndCompanionObjects` {
}