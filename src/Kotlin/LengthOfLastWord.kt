package Kotlin

fun main() {
    print("Enter the string : ")
    val s = readln()
    println(lengthOfLastWord(s))
    println(lengthOfLastWord2(s))
}

/**
 * function to find the length of last word in the string
 * @param s pass a string to find length of the last word
 * @return length of last word
 */
fun lengthOfLastWord(s: String): Int {
    val list = s.split(" ")
    return if (s.isEmpty()) list.last().length else 0
}

// another implementation
fun lengthOfLastWord2(s: String): Int {
    var len = 0
    for (i in (s.length - 1) downTo 0) {
        if (s[i] != ' ' && s.isNotEmpty()) {
            len++
            continue
        }
        break
    }
    return len
}