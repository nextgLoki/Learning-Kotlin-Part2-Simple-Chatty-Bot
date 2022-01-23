package bot

import kotlin.math.abs


fun main() {
    greet("Bot", "2050")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.\n" +
            "I was created in $birthYear.\n" +
            "Please, remind me your name.")
}

fun remindName() {
    val name = readLine()!!
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.")
    val (rem3, rem5, rem7) = Array(3) { readLine()!!.toInt() }
    val age = getGuessAge(rem3, rem5, rem7)
    println("Your age is $age; that's a good time to start programming!")
}

fun getGuessAge(remainder3: Int, remainder5: Int, remainder7: Int) =
    (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    Array(abs(readLine()!!.toInt()) + 1) { it }
        .map { "$it!" }
        .forEach(::println)
}

fun test() {
    println("Let's test your programming knowledge.\n" +
            "Why do we use methods?\n" +
            "1. To repeat a statement multiple times.\n" +
            "2. To decompose a program into several small subroutines.\n" +
            "3. To determine the execution time of a program.\n" +
            "4. To interrupt the execution of a program.")
    do {
        when (readLine()!!.toInt()) {
            2 -> return
            else -> println("Please, try again.")
        }
    } while (true)
}

fun end() {
    println("Congratulations, have a nice day!")
}
