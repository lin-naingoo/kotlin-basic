package io

fun main() {
    println("Enter a word to guess: ")
    val word = readLine()

    if (checkNullOrEmpty(word)) {
        println("No word given! Game ends!")
        return
    }

    for (i in 1..10) {
        println()
    }

    // tree
    // t r e
    val lowerCaseWord = word!!.lowercase();
    val letters = lowerCaseWord.toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var total = 0;
    var fails = 0

    while (letters != correctGuesses) {
        printExploitedLetters(lowerCaseWord, correctGuesses)
        println("Wrong guesses: $fails")

        print("Guess a letter: ")
        val input = readLine()
        if (checkNullOrEmpty(input)) {
            continue
        }
        val lowerCaseInput = input!!.lowercase()

        if (lowerCaseWord.contains(lowerCaseInput)) {
            correctGuesses.add(lowerCaseInput[0])
        } else {
            fails++
        }
        total++
    }

    println()
    println("The correct word is \"$word\"!")
    println("Total guess: $total, Wrong guesses: $fails")
    println("You won!")
}

fun checkNullOrEmpty(input: String?) = input == null || input.isEmpty()

fun printExploitedLetters(lowerCaseWord: String, correctGuesses: Set<Char>) {
    for (char in lowerCaseWord) {
        if (correctGuesses.contains(char)) {
            print("$char ")
        } else {
            print("_ ")
        }
    }

    println()
}