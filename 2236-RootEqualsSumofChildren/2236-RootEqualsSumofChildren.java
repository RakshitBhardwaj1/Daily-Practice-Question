// Last updated: 2/16/2026, 8:48:28 PM
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
17    public boolean checkTree(TreeNode root) {
18        if(root==null){
19            return false;
20        }
21        int sum=0;
22        if(root.left!=null || root.right!=null){
23            sum+=root.left.val;
24            sum+=root.right.val;
25
26        }
27        if(sum==root.val){
28            return true;
29        }
30        else{
31            return false;
32        }
33    }
34
35}