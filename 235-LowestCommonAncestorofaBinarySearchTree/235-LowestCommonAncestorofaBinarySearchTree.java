// Last updated: 4/4/2026, 12:32:15 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if(p.val<root.val && q.val<root.val){
14            return lowestCommonAncestor(root.left,p,q);
15
16        }
17        if(p.val>root.val && q.val>root.val){
18            return lowestCommonAncestor(root.right,p,q);
19        }
20        return root;
21    }
22}