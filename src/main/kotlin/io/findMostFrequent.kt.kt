package io

import java.io.File

fun main() {
    val ipCountMap = mutableMapOf<String, Int>();
    File("src/main/kotlin/io/files/ips.txt").forEachLine {
        var count = ipCountMap.getOrDefault(it, 0)
        ipCountMap[it] = ++count
    }

    /*var maxCount = 1;
    var ipAddress = ipCountMap.keys.first()
    for((ip, count) in ipCountMap.entries){
        println("$ip count=$count")
        if (count > maxCount) {
            maxCount = count
            ipAddress = ip
        }
    }*/
    val (ipAddress, maxCount) = ipCountMap.entries.maxBy { it.value }

    println("The most frequent ip address is $ipAddress and it occurs $maxCount times")
}