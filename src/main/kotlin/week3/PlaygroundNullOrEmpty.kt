package week3

import util.eq

class PlaygroundNullOrEmpty {

    fun main(args: Array<String>) {
        val s1: String? = null
        val s2: String? = ""
        s1.isEmptyOrNull() eq true
        s2.isEmptyOrNull() eq true

        val s3 = "   "
        s3.isEmptyOrNull() eq false
    }

    // private fun String?.isEmptyOrNull(): Boolean = this?.isEmpty() ?: true
    fun String?.isEmptyOrNull(): Boolean = this == null || this.isEmpty()

}