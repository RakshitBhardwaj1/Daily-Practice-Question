// Last updated: 3/13/2026, 6:54:07 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isUnivalTree(TreeNode root) {
18        if(root==null){
19            return true;
20        }
21        if(root.left!=null && root.left.val!=root.val){
22            return false;
23        }
24        if(root.right!=null && root.right.val!=root.val){
25            return false;
26        }
27        return isUnivalTree(root.left)&&isUnivalTree(root.right);
28    }
29}