package binaryNumberInALinkedList

fun getNumber(binary: SinglyLinkedListNode?): Long {
    var singleBinary = binary
    var string = ""
    while (singleBinary != null) {
        string += singleBinary.data
        singleBinary = singleBinary.next
    }
    return string.toLong(2)
}

fun main(args: Array<String>) {
    val binary = SinglyLinkedList()
    binary.insertNode(0)
    binary.insertNode(0)
    binary.insertNode(0)
    binary.insertNode(0)
    binary.insertNode(0)
    binary.insertNode(1)
    binary.insertNode(1)
    binary.insertNode(1)
    binary.insertNode(1)
    binary.insertNode(1)
    binary.insertNode(0)
    binary.insertNode(1)

    val result = getNumber(binary?.head)

    println(result)
}