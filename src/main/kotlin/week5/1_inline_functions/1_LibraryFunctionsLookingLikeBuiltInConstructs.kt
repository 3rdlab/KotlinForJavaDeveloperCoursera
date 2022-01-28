package week5.`1_inline_functions`


/*
    Useful library functions

    run, let, takeIf, takeUnless, repeat

 */


// run : runs the block of code and returns the last expressions as the result
val foo = run {
    println("Calculating foo..")
    "foo"
}


/*
    * let : allows to check the argument for being non-null, not only the receiver

    fun getEmail(): Email?
    val email = getEmail()

    if(email != null) sendEmailTo(email)
    ===>
    email?.let { e -> sendEmailTo(e) }
    getEmail()?.let { sendEmailTo(it) }


    interface Session{
        val user: User
    }

    fun analyzeUserSession(session: Session){
        val user = session.User
        if( user is FacebookUser) {
            println(user.accountId)
        }
        =====>
        (session.user as? FacebookUser)?.let { println(it.accountId) }
    }
 */

/*
    * takeIf : returns the receiver object if it satisfies the given predicate, otherwise returns null

    issue.takeIf { it.status == FIXED }
    person.patronymicName.takeIf(String::isNotEmpty)
    issues.filter{ it.status == OPEN }
        .takeIf(List<Issue>::isNotEmpty)
        ?.let { println("There are some open issues") }
 */

/*
    * takeUnless : returns the receiver object if it does not satisfy the given predicate, otherwise returns null

    person.patronymicName.takeUnless(String?::isNullOrEmpty)
 */


/*
    repeat : repeats an action

    repeat(10) {
        println("Welcome")
    }
 */


class LibraryFunctionsLookingLikeBuiltInConstructs {
}