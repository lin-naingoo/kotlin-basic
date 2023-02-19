import conditionals.checkAge
import conditionals.getLuckyNumber
import loops.printFavoriteBook
import loops.sumOfNumbers

fun main() {
    println("What is your name?")
    val name = readln()
    println("Hello, $name!")

    println()
    println("What is your age?")
    val age = readln()
    checkAge(age.toInt())

    println()
    println("Generating your lucky number!")
    val luckyNumber = getLuckyNumber()
    println("Your lucky number is $luckyNumber!")

    println()
    println("What is the first number?")
    val firstNumber = readln()
    println("What is the second number?")
    val secondNumber = readln()
    val sum = sumOfNumbers(firstNumber.toLong(), secondNumber.toLong())
    println("Sum of $firstNumber and $secondNumber is $sum")

    println()
    printFavoriteBook()
}

