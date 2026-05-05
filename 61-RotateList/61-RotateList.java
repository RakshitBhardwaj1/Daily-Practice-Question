// Last updated: 5/5/2026, 9:53:21 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0) {
14            return head;
15        }
16
17        // Step 1: Find length
18        ListNode temp = head;
19        int n = 1;
20        while (temp.next != null) {
21            temp = temp.next;
22            n++;
23        }
24
25        // Step 2: Normalize k
26        k = k % n;
27        if (k == 0) return head;
28
29        // Step 3: Make circular
30        temp.next = head;
31
32        // Step 4: Find new tail
33        int stepsToNewTail = n - k;
34        ListNode newTail = head;
35
36        for (int i = 1; i < stepsToNewTail; i++) {
37            newTail = newTail.next;
38        }
39
40        // Step 5: Break the circle
41        ListNode newHead = newTail.next;
42        newTail.next = null;
43
44        return newHead;
45    }
46}