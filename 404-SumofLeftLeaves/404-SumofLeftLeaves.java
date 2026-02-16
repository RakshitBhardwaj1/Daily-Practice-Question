// Last updated: 2/16/2026, 7:54:39 PM
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
17    public int sumOfLeftLeaves(TreeNode root) {
18        if(root==null){
19            return 0;
20        }
21        int sum=0;
22        if(root.left!=null && root.left.left==null && root.left.right==null){
23            sum+=root.left.val;
24        }
25        sum+=sumOfLeftLeaves(root.left);
26        sum+=sumOfLeftLeaves(root.right);
27
28        return sum;
29    }
30}