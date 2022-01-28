package week5.`2_sequences`


/*
    map, filterNotNull ==> mapNotNull

    people.filterNotNull().map{ it.name }
    ==>
    people.mapNotNull{ it?.name }

 */

class Person(val age: Int)


val people = listOf(Person(12), Person(50))

fun main(){
    val map = mutableMapOf<Int, MutableList<Person>>()
    for (person in people){
//        if(person.age !in map) {
//            map[person.age] = mutableListOf()
//        }
//        val group = map.getValue(person.age)
//        ===>
        val group = map.getOrPut(person.age){ mutableListOf() }
        group += person
    }

    // ===>
    people.groupBy{ it.age }
    people.asSequence().groupingBy{ it.age }.eachCount() // creates a grouping to be used later

}



class `4_LibraryFunctions` {
}