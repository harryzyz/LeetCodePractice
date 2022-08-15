import java.util.LinkedList;

public class No876MiddleOfTheLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkylist = new LinkedList<Integer>();
        linkylist.add(1);
        linkylist.add(2);
        linkylist.add(3);
        linkylist.add(4);
        linkylist.add(5);
        System.out.println(linkylist);
        // ListNode head = new ListNode();
        
        // System.out.println(head.next);
        linkylist.
        // System.out.println(middleNode(head));
    }

    // public static LinkedList<Integer> middleNode(LinkedList<Integer> head) {
        public static ListNode middleNode(ListNode head) {    
        ListNode i = head, j = head;
        while (j != null && j.next != null) {
            j = j.next.next;
            i = i.next;
        }
        return i;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

}



// Given the head of a singly linked list, return the middle node of the linked
// list.

// If there are two middle nodes, return the second middle node.

// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.
// Example 2:

// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we
// return the second one.

// Constraints:

// The number of nodes in the list is in the range [1, 100].
// 1 <= Node.val <= 100
