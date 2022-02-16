/* Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
Memory Usage: 42.7 MB, less than 5.51% of Java online submissions for Swap Nodes in Pairs.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class swapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null)) {//if empty list or single element
            return head;
        }
        ListNode nodeA = new ListNode();
        ListNode nodeB = new ListNode();
        nodeA = head;
        nodeB = head.next;
        nodeA.next = nodeB.next;
        nodeB.next = nodeA;
        head = nodeB;//first case is special because of list head
        while ((nodeA.next != null)&&(nodeA.next.next != null)) {//still got stuff to swap
            nodeB = nodeA.next;
            nodeA.next = nodeB.next;
            nodeA = nodeB.next;
            nodeB.next = nodeA.next;
            nodeA.next = nodeB;
            nodeA = nodeB;
        }
        return head;
    }
}