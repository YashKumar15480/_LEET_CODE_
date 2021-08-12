/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode l1 = new ListNode(-1);
        l1.next = head;

        ListNode l2 = l1;

        while (l2.next != null) {
            if (l2.next.val == val)
                l2.next = l2.next.next;
            else
                l2 = l2.next;
        }
        return l1.next;
    }
}

public class Remove_Linked_List_Elements {
    public static void main(String[] args) {

    }
}