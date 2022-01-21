package week4.oop

class `4_ClassModifiers-2` {
}

/*
    sealed modifier

    Restricts class hierarchy
    all subclasses must be located in the same file.

 */

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int = when(e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    // no else needed Because Expr is "Sealed"
}


/*
    Inner and nested classes
 */

class AA {
    class B
    inner class C{
        // ..this@AA..
    }
}
/*
    Class delegation

    class Controller(
        repository: Repository,
        logger: Logger
    ) : Repository by repository, Logger by logger
 */
class Customer

interface Repository{
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller( repository: Repository, logger: Logger): Repository by repository, Logger by logger
fun use(controller: Controller){
    controller.logAll()
}