package classes.lend

abstract class InventoryItem(
    val title: String,
    val genre: String,
    val publicationYear: Int,
    var isBorrowed: Boolean = false
) : Lendable {
    override fun borrow() {
        if (!isBorrowed) {
            isBorrowed = true
        } else {
            println("Already borrow!")
        }
    }

    override fun toString() = "InventoryItem(title=$title, genre=$genre, publicationYear=$publicationYear)"

    abstract fun copy(): InventoryItem
}

fun main() {
    val item1 = Book("Clean Code", "Uncle Bob", "Programming", 2016)
    val item2 = DVD("Mission Impossible", 120, "Action", 2020)
    println(item1)
    println(item2)
}