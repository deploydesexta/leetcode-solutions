/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) return null
        if (head.next == null) return head
        
        var node = head
        var count = 1
        while (true) {
            if (node?.next == null) {
                break
            }

            if (count % 2 != 0) {
                val current = node.`val`
                val next = node.next!!.`val`
                node.`val` = next
                node.next!!.`val` = current
            }

            node = node.next!!
            count++
        }

        return head
    }
}