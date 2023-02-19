package classes.lend

class Book(
    title: String,
    private val author: String,
    genre: String,
    publicationYear: Int
) : InventoryItem(title, genre, publicationYear) {

    override fun copy(): InventoryItem {
        val newBook = Book(title, author, genre, publicationYear)
        newBook.isBorrowed = this.isBorrowed
        return newBook
    }

    override fun toString() = "Book(title=$title, author=$author, genre=$genre, publicationYear=$publicationYear)"
}