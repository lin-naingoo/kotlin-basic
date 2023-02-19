package io

import java.util.*

fun main() {
    val number = Random().nextInt(100) + 1;
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess a number between 1 and 100: ")
        input = readLine()
        if (input != null) {
            guess = input.toInt()
            if (guess < number) println("$guess is Too low!")
            else if (guess > number) println("$guess is Too large!")
            else println("You guess it right!")
        }
    }

}