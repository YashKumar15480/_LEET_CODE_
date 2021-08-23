/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode l1 = head;
        ListNode l2 = head;

        while (l1 != null && l1.next != null) {
            l2 = l2.next;
            l1 = l1.next.next;
        }
        return l2;
    }
}

public class Middle_of_the_Linked_List {
    public static void main(String[] args) {

    }
}
