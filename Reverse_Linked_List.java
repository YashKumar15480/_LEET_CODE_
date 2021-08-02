/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode l1 = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = l1;
            l1 = head;
            head = temp;
        }
        return l1;
    }
}

public class Reverse_Linked_List {
    public static void main(String[] args) {

    }

}
