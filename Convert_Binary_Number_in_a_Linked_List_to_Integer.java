/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int n = head.val;
        while (head.next != null) {
            n = n * 2 + head.next.val;
            head = head.next;
        }
        return n;
    }
}

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public static void main(String[] args) {

    }
}
