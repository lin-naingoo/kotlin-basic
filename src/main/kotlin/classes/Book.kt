package classes

/* Book class with the specified properties and methods. */

class Book(
    private val title: String,
    private val author: String,
    private val publishedYear: Int,
    private var isBorrowed: Boolean = false,
) {
    fun print() {
        println("Title: $title")
        println("Author: $author")
        println("Publication Year: $publishedYear")
    }

    fun borrow() {
        if (!isBorrowed) {
            isBorrowed = true
        } else {
            println("The book is already borrowed!")
        }
    }

    fun returnBorrow() {
        if (isBorrowed) {
            isBorrowed = false
        } else {
            println("You cannot return the book which is not borrowed!")
        }
    }
}

fun main() {
    val book = Book("Clean Code", "Uncle Bob", 2016, false);
    book.print()
    book.returnBorrow()
    book.borrow()
    book.borrow()
    book.returnBorrow()
}