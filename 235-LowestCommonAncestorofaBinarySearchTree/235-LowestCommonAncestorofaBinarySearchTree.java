// Last updated: 3/14/2026, 1:39:53 PM
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
17    public TreeNode insertIntoBST(TreeNode root, int val) {
18        if(root==null){
19            return new TreeNode(val);
20        }
21        if(root.val<val){
22            root.right=insertIntoBST(root.right,val);
23        }
24        else{
25            root.left=insertIntoBST(root.left,val);
26        }
27        return root;
28    }
29}