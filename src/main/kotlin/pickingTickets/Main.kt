package pickingTickets

import java.util.Collections

fun maxTickets(tickets: Array<Int>): Int {
    tickets.sort()
    val count = mutableListOf<Int>()
    count.add(1)

    for (i in 0 until tickets.size-1){
        if (tickets[i] == tickets[i+1] || tickets[i]+1 == tickets[i+1]){
            count[count.lastIndex]++
        } else {
            count.add(1)
        }
    }
    return Collections.max(count)
}

fun main(args: Array<String>) {

    val tickets = arrayOf(3,6,2,1)

    val res = maxTickets(tickets)

    println(res)
}
