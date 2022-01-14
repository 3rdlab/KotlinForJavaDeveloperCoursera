package week3.functionalProgramming

/*
** Return from lambda
*
* return list.flatMap{
*   if(it == 0) return@flatMap listOf<Int>()
*   listOf(it, it)
* }
*
* list.flatMap l@{
*   if(it == 0) return@@l listOf<Int>()
*   listOf(it, it)
* }
*
* without @flatMap, return function return
*
** anonymous function
*
* list.flatMap{fun (e): List<Int> {
*   if(e == 0) return listOf()
*   return listOf(e, e)
* }
*
*/


class ReturnFromLambda {
}