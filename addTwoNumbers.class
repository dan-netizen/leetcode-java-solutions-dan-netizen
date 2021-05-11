/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean nover1 = true;
        boolean nover2 = true;
        ListNode l3 = new ListNode();
        ListNode answ = l3;
        boolean big = false;
        int a, b;
        do {
            if (nover1) { a = l1.val;} else { a = 0;}
            if (nover2) { b = l2.val;} else { b = 0;}
            int k = a + b;
            if (big) { k++;}
            if (k > 9) {big = true;} else {big = false;}
            l3.val = k%10;
            if (l1.next != null) {l1 = l1.next;} else {nover1 = false;}
            if (l2.next != null) {l2 = l2.next;} else {nover2 = false;}
            if ((nover1 || nover2) || big) {
                l3.next = new ListNode();
                l3 = l3.next;
            }
        } while ((nover1 || nover2) || big);
        if (big) {
            l3.val = 1;
        }
        return answ;
    }
}