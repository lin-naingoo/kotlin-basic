package loops

/* Create array list of book titles, loops over it and, if the title contains 'e', prints each char. */

fun printFavoriteBook() {
    val books = arrayListOf("Lord of rings", "Harry Potter", "TDD", "Clean Code")
    println("The title of favorite book is -")

    for (title in books) {
        if (!title.contains('e')) {
            continue
        }
        for (char in title) {
            println(char)
        }
        println()
    }
}