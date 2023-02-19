package classes.lend

class DVD(
    title: String,
    private val length: Int,
    genre: String,
    publicationYear: Int
) : InventoryItem(title, genre, publicationYear) {
    override fun copy(): InventoryItem {
        val newDVD = DVD(title, length, genre, publicationYear)
        newDVD.isBorrowed = isBorrowed
        return newDVD
    }

    override fun toString() =
        "DVD(title=$title, length=$length seconds, genre=$genre, publicationYear=$publicationYear)"
}