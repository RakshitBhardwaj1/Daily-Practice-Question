// Last updated: 2/15/2026, 5:49:25 PM
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
17    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
18        if(root1==null && root2==null){
19            return true;
20        }
21        if(root1==null || root2==null){
22            return false;
23        }
24        if(root1.val != root2.val){
25            return false;
26        }
27        boolean flip=flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);
28        boolean noflip = flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right);
29        return flip||noflip;
30    }
31}