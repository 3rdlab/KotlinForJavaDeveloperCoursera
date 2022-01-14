package week3.functionalProgramming

/*
* * function Reference syntax
*
* Kotlin cannot assign function to variable ( only lambdas)
* If it is needed, use function reference syntax
*
 */

fun isEvenEven(i:Int): Boolean = i % 2 == 0
val predicate = ::isEvenEven
// ====>
val predicate2 = { i:Int -> isEvenEven(i) }

/*
*  val action = {person: Person, message: String -> sendEmail(person, message) }
*  =====>
*  val action = ::sendEmail
*           compiler infers the types for you
*
 */

/*
* Passing function reference as an argument
*
* list.any(::isEven)
* list.filter(::isEven)
 */


// Bound : inside of Object

/*
** Bound & non-bound references **
*
* class Person(val name: String, val age: Int){
*   fun isOlder(ageLimit:Int) = age > ageLimit
* }
*
* val agePredicate = Person::isOlder            // non-bound reference
* val agePredicate: (Person, Int) -> Boolean = Person::isOlder
*
* val alice = Person("Alice, 29)
* agePredicate(alice, 21)
*
* val agePredicate2 = alice::isOlder // bound reference
* agePredicate2(21)         // true
 */

/*
*** Bound to this reference
*
*   class Person(val name: String, val age: Int){
*       fun isOlder(ageLimit: Int) = age > ageLimit
*       fun getAgePredicate() = this::isOlder   // this can ommited
*       fun getAgePredicate() = ::isOlder
*   }
*
*
 */


class MemberReferences {
}