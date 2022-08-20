package binaryNumberInALinkedList

class SinglyLinkedListNode(nodeData: Int) {
    public var data: Int
    public var next: SinglyLinkedListNode?

    init {
        data = nodeData
        next = null
    }
}

class SinglyLinkedList {
    public var head: SinglyLinkedListNode?
    public var tail: SinglyLinkedListNode?

    init {
        head = null
        tail = null
    }

    public fun insertNode(nodeData: Int) {
        var node = SinglyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
        }

        tail = node
    }

}

fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node?.data)
        node = node?.next

        if (node != null) {
            print(sep)
        }
    }
}