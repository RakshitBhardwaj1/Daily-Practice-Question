// Last updated: 3/12/2026, 4:53:35 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if(root==null){
13            return null;
14        }
15        if(root==p || root==q){
16            return root;
17        }
18        TreeNode Left=lowestCommonAncestor(root.left,p,q);
19        TreeNode right=lowestCommonAncestor(root.right,p,q);
20        if(Left!=null && right!=null){
21            return root;
22        }
23        if(Left==null){
24            return right;
25        }
26        else{
27            return Left;
28        }
29    }
30}