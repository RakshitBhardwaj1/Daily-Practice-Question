// Last updated: 2/16/2026, 7:11:03 PM
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
17    public TreeNode invertTree(TreeNode root) {
18        if(root==null){
19            return null;
20        }
21        TreeNode temp=root.left;
22        root.left=root.right;
23        root.right=temp;
24
25        invertTree(root.left);
26        invertTree(root.right);
27
28        return root;
29    }
30}