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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = count(head);
        int parts = size/k;
        int remainder = size%k;
        ListNode[] result = new ListNode[k];
        ListNode current = head;
        for(int i=0; i<k && current!=null; i++){
            result[i] = current;
            int partSize = parts + (remainder > 0 ? 1:0);
            for(int j=1; j<partSize; j++){
                current = current.next;
            }
            ListNode nextPart = current.next;
            current.next = null;
            current = nextPart;
            remainder--;
        }
        return result;
    }
    private int count(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}