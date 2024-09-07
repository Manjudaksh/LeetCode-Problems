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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }
    boolean dfs(ListNode head, ListNode current, TreeNode root){
        if(current == null){
            return true;
        }
        
        if(root == null){
            return false;
        }
        
        if(current.val == root.val){
            current = current.next;
        } else if(head.val == root.val){
            head = head.next;
        } else{
            current = head;
        }
        return dfs(head, current, root.left) || dfs(head, current, root.right);
    }
}