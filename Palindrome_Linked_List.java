import java.util.ArrayList;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();

        l1.add(head.val);
        while (head.next != null) {
            l1.add(head.next.val);
            head = head.next;
        }

        String ch[] = new String[l1.size()];

        for (int i = 0; i < l1.size(); i++)
            ch[i] = Integer.toString(l1.get(i));

        StringBuffer s = new StringBuffer();

        for (int i = 0; i < l1.size(); i++)
            s.append(ch[i]);

        String s1 = s.toString();

        System.out.print(s);
        StringBuffer sb = new StringBuffer(s1);
        String b = sb.reverse().toString();

        if (s1.equals(b))
            return true;
        else
            return false;
    }
}

public class Palindrome_Linked_List {

    public static void main(String[] args) {

    }
}
