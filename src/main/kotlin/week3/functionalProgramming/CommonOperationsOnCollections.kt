package week3.functionalProgramming
import week3.functionalProgramming.CommonOperationsOnCollections.Gender.*

class CommonOperationsOnCollections {
    /*  Operations Quiz */
    data class Hero(
        val name: String,
        val age: Int,
        val gender: Gender?
    )

    enum class Gender { MALE, FEMALE }

    val heroes = listOf(
        Hero("The Captain", 60, MALE),
        Hero("Frenchy", 42, MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, FEMALE),
        Hero("First Mate", 29, MALE),
        Hero("Sir Stephen", 37, MALE))


    fun quiz1(){
        heroes.last().name                          // Sir Stephen
        heroes.firstOrNull { it.age == 30 }?.name   //  null
        heroes.map { it.age } .distinct().size      //  5
        heroes.filter{it.age < 30}.size             //  3

        val (youngest, oldest) = heroes.partition { it.age < 30 }
        oldest.size // 3

        heroes.all { it.age < 50 }                  // false
        heroes.any { it.gender == FEMALE }          // true
    }

    fun quiz2(){
        val mapByAge: Map<Int, List<Hero>> = heroes.groupBy { it.age }
        val (age, group) = mapByAge.maxByOrNull { (_, group) -> group.size }!!
        println(age)                        // 29

        val mapByName: Map<String, Hero> = heroes.associateBy { it.name }
        mapByName["Frenchy"]?.age               // 42
        mapByName.getValue("Frenchy").age // 42

        mapByName["unknown"]?.age               // null
        mapByName.getValue("unknown").age // NoSuchElementException

        val anotherMapByName = heroes.associateBy { it.name }
        val unknownHero = Hero("Unknown", 0, null)
        anotherMapByName.getOrElse("unknown") { unknownHero }.age   //  0

        val mapByName2 = heroes.associate { it.name to it.age }
        mapByName2.getOrElse("unknown") { 0 }

        val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } } // confusing. don't do this
            .maxByOrNull { it.first.age - it.second.age }!!
        first.name

        val allPossiblePairs = heroes
            .flatMap{ first -> heroes.map { second -> first to second}}

        val (oldest, youngest) = allPossiblePairs
            .maxByOrNull { it.first.age - it.second.age }!!
        oldest.name

        /*

        - don't use it if it has different types in neighbouring lines
        - prefer explicit parameter names if it might be confusing otherwise
        - learn the library and try to reuse the library functions as much as possible

         */
    }

}
