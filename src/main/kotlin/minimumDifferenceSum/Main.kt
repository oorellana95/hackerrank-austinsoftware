package minimumDifferenceSum

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.ranges.*

fun minDiff(arr: Array<Int>): Int {
    arr.sort()
    var minSum = 0
    for (i in 0 until arr.size-1){
        minSum += abs(arr[i] - arr[i+1])
    }
    return minSum
}

fun main(args: Array<String>) {

    val result = minDiff(arrayOf(1,3,2,4))

    println(result)
}
