package week4.properties

/*
    Property in interface
 */

interface User {
    val nickname: String
}

class FacebookUser(val accountId: Int) : User{
    override val nickname = "getFacebookName(accountId)"
}


/*
    Open property can't be used in smart casts
 */

interface Session{
    val user: User
}

fun analyzeUserSession(session: Session){
    val user = session.user
    if(user is FacebookUser){
        println(user.nickname)
    }
}

/*
    Extension properties
 */

val String.lastIndex: Int
    get() = this.length - 1

val String.indices: IntRange
    get() = 0..lastIndex

val test = "abc".indices


/*
    Mutable extension properties
 */

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char){
        this.setCharAt(length - 1, value)
    }

val sb = StringBuilder("Kotlin?")
val test2 = {
    sb.lastChar = '!' // Kotlin!
}

class MoreAboutProperties {
}