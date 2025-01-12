package cusufcan

// Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                list1.next = mergeTwoLists(list1.next, list2)
                return list1
            } else {
                list2.next = mergeTwoLists(list1, list2.next)
                return list2
            }
        }

        if (list1 == null) return list2
        return list1
    }
}