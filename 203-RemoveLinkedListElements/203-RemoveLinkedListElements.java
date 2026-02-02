// Last updated: 2/2/2026, 9:37:10 PM
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
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode dummy=new ListNode();
14        dummy.next=head;
15        ListNode curr=dummy;
16        while(curr.next!=null){
17            if(curr.next.val==val){
18                curr.next=curr.next.next;
19            }
20            else{
21                curr=curr.next;
22            }
23        }
24        return dummy.next;
25    }
26}