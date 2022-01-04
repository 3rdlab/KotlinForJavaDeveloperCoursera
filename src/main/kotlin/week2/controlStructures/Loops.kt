package week2.controlStructures

class Loops {

    val list = listOf("a", "b", "c")
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    fun forLoop(){
        for(s in list){  print(s)  }

        for ((key, value) in map) {  println("$key = $value")  }

        for ((index, value) in list.withIndex()) {  println("$index: $value")  }

        for(i in 1..9){  print(i)  } // 12345678 9
        for(i in 1 until 9){  print(i)  } // 1234567 8
        for(i in 9 downTo 1 step 2) { print(i) } // 97531
        for(ch in "abc"){ print(ch + 1) } // bcd
    }

}