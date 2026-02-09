// Last updated: 2/9/2026, 7:05:11 AM
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
17    public boolean isBalanced(TreeNode root) {
18        if (root == null) {
19            return true;
20        }
21
22        int leftHeight = getHeight(root.left);
23        int rightHeight = getHeight(root.right);
24
25        if (Math.abs(leftHeight - rightHeight) > 1) {
26            return false;
27        }
28
29        return isBalanced(root.left) && isBalanced(root.right);
30    }
31
32    private int getHeight(TreeNode node) {
33        if (node == null) {
34            return 0;
35        }
36
37        int leftHeight = getHeight(node.left);
38        int rightHeight = getHeight(node.right);
39
40        return Math.max(leftHeight, rightHeight) + 1;
41    }
42}
43