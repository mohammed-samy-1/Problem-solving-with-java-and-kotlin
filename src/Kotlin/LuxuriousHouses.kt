package Kotlin

fun main() {
    print("enter the number of houses : ")
    val num = readln();
    print("enter the number of flours in each house : ")
    val s = readln();
    testLuxurious(s)
}
/**
 * Let's enumerate all the houses from left to right, starting with one.
 * A house is considered to be luxurious if the number of floors in it is strictly greater than in all the houses with larger numbers.
 * In other words, a house is luxurious if the number of floors in it is strictly greater than in all the houses, which are located to the right from it.
 * In this task it is assumed that the heights of floors in the houses are the same.
 * The new architect is interested in n questions, i-th of them is about the following: "how many floors should be added to the i-th house to make it luxurious?" (for all i from 1 to n, inclusive).
 * You need to help him cope with this task.
 * Note that all these questions are independent from each other — the answer to the question for house i does not affect other answers (i.e., the floors to the houses are not actually added)
 *
 *  eg:- input : 1 2 3 1 2   output : 3 2 0 2 0
 *  eg:- input : 3 2 1 4     output : 2 3 4 0
 *
 * @param s pass number of flowers in each house separated by space
 * @output a1,a2,...,an, where number ai is the number of floors that need to be added to the house number i to make it luxurious.
 *         If the house is already luxurious and nothing needs to be added to it, then ai should be equal to zero.
 */
fun testLuxurious(s: String) {
    val list = s.split(" ")
    for (i in list.indices) {
        var maxDiff = 0
        val current = list[i].toInt()
        for (j in i + 1 until (list.size)) {
            val value = list[j].toInt()
            if (value >= current && value - current >= maxDiff  ) {
                maxDiff = value - current + 1
            }
        }
        print("$maxDiff ")
    }
}
