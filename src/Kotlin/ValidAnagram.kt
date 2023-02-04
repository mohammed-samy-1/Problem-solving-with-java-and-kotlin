package Kotlin

fun main() {
    println("enter first string: ")
    val s = readln()
    println("enter second string: ")
    val s2 = readln()
    println(anagramTest(s, s2))
}

/**
 * eg:- input anagram , magaram   output true
 * eg:- input anagram , magarm    output false
 * eg:- input anagram , magarms   output false
 * @param s pass the first string
 * @param s2 pass the second string
 * @return if s and s2 are equal or contain exactly same letters with same number of repetition return true
 * otherwise return false
 */
fun anagramTest(s:String,s2:String): Boolean{
    return if (s.length == s2.length)
        s.toCharArray().sortedArray().contentEquals(s2.toCharArray().sortedArray())
    else
        false
}