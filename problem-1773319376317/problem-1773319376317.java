// Last updated: 3/12/2026, 6:12:56 PM
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
17    int max=Integer.MIN_VALUE;
18    public int diameterOfBinaryTree(TreeNode root) {
19        Dia(root);
20        return max;
21    }
22    public int Dia(TreeNode root){
23        if(root==null){
24            return 0;
25        }
26        int left=Dia(root.left);
27        int right=Dia(root.right);
28        max=Math.max(max,(left+right));
29        return Math.max(left, right) + 1;
30    }
31}