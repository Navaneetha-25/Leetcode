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
class Solution {
    public int pairSum(ListNode head) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        ListNode slow=head,fast=head,prev=null;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }

        while(slow!=null){
            sum=prev.val+slow.val;
            max=Math.max(max,sum);
            prev=prev.next;
            slow=slow.next;
        }

        return max;

    }
}