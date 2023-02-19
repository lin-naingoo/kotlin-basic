package conditionals

import kotlin.random.Random

/* Get the random number between 1 and 50 and print a message by when statement. */

fun getLuckyNumber(): Int {
    val random = Random.nextInt(50) + 1
    when (random) {
        in 1..10 -> println("...Looking between 1 and 10")
        in 11..20 -> println("...Looking between 11 and 20")
        in 21..30 -> println("...Looking between 21 and 30")
        in 31..40 -> println("...Looking between 31 and 40")
        else -> println("...Looking between 41 and 50")
    }
    return random
}