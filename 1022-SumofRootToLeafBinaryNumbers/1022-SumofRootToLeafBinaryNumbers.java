// Last updated: 3/12/2026, 1:40:58 PM
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
17    public int sumRootToLeaf(TreeNode root) {
18        return binaryNum(root,0);
19    }
20    public int binaryNum(TreeNode root,int binary){
21        if(root==null){
22            return 0;
23        }
24        binary=binary*2+root.val;
25        if(root.left == null && root.right == null){
26            return binary;
27        }
28        return binaryNum(root.left,binary)+binaryNum(root.right,binary);
29    }
30}