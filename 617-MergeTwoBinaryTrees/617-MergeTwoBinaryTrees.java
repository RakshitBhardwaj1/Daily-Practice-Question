// Last updated: 4/4/2026, 4:54:04 PM
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
13 *   }
14 * }
15 */
16class Solution {
17    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
18        if(root1==null && root2==null){
19            return null;
20        }
21        if(root2==null){
22            return root1;
23        }
24        if(root1==null){
25            return root2;
26        }
27        TreeNode root = new TreeNode(root1.val + root2.val);
28        root.left = mergeTrees(root1.left, root2.left);
29        root.right = mergeTrees(root1.right, root2.right);
30
31        return root;
32    }
33}