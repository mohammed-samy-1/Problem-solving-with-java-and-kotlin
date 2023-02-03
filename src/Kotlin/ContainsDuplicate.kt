package Kotlin

fun main() {
    print("please enter a string : ")
    val s = readln()
    println(containsDuplicate(s))

}
/**
 * find out if the string contains duplication
 * @param s pass the string you want to test
 * @return true if the string have at least duplicated char
 */
fun containsDuplicate(s: String): Boolean {
    var letters = ""
    for (i in s.toCharArray()) {
        if (letters.contains(char = i, false)) {
            return true
        }
        letters += i
    }
    return false
}