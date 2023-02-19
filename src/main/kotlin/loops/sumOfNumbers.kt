package loops

/* Calculate the sum of numbers by for loop in a range. */

fun sumOfNumbers(startRange: Long, endRange: Long): Long {
    var sum = 0L;
    for (num in startRange..endRange) {
        sum += num
    }
    return sum
}