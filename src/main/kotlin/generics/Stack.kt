package generics

class Stack<E>(vararg items: E) {
    private val elements = items.toMutableList();

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (elements.isNotEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}

fun main() {
    val stack = Stack(1, 2, 3, 4)
    println(stack.pop())
    println(stack.pop())
    stack.push(5)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stringStack = stackOf("Hello", "Hi", "Hey")
    println(stringStack.pop())
    println(stringStack.pop())
    println(stringStack.pop())
}